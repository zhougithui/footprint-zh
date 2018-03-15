package com.lanmao.data.sync.http.async;

import com.lanmao.data.sync.http.async.http.CustomConnectingIOReactor;
import com.lanmao.data.sync.http.async.http.CustomExceptionLogger;
import com.lanmao.data.sync.http.async.http.FutureCallbackCatcher;
import com.lanmao.data.sync.http.async.http.TrustAnyTrustManager;
import com.lanmao.runtime.util.collection.IteratorUtils;
import com.lanmao.runtime.util.etc.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ssl.DefaultHostnameVerifier;
import org.apache.http.conn.util.PublicSuffixMatcher;
import org.apache.http.conn.util.PublicSuffixMatcherLoader;
import org.apache.http.entity.ContentType;
import org.apache.http.impl.nio.client.CloseableHttpAsyncClient;
import org.apache.http.impl.nio.client.HttpAsyncClients;
import org.apache.http.impl.nio.conn.PoolingNHttpClientConnectionManager;
import org.apache.http.impl.nio.reactor.IOReactorConfig;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.nio.conn.NoopIOSessionStrategy;
import org.apache.http.nio.conn.SchemeIOSessionStrategy;
import org.apache.http.nio.conn.ssl.SSLIOSessionStrategy;
import org.apache.http.nio.entity.NStringEntity;
import org.apache.http.nio.protocol.HttpAsyncRequestExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.concurrent.*;

@Service
public class AsyncNotifier {

	private final Logger logger = LoggerFactory.getLogger(AsyncNotifier.class);

	private CloseableHttpAsyncClient httpclient;

	private Charset charset = StandardCharsets.UTF_8;

	private Executor executor;

	 private ScheduledExecutorService schedule;

	private ConcurrentHashMap<Future<HttpResponse>, Object> futures = new ConcurrentHashMap<Future<HttpResponse>, Object>();
	
	private int queueSize = 100000;
	
	private String proxyHost;

	private int messageLoggerLength;

	public AsyncNotifier() throws Exception {
		
		queueSize = 100000;
		proxyHost = null;
		messageLoggerLength = 100;
		executor = new ThreadPoolExecutor(20, 20, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(queueSize));
		
		
		// 清理漏掉的
		schedule = Executors.newScheduledThreadPool(1);
		schedule.scheduleWithFixedDelay(() -> {
			Iterator<Entry<Future<HttpResponse>, Object>> it = futures.entrySet().iterator();
			while (it.hasNext()) {
				Entry<Future<HttpResponse>, Object> e = it.next();
				if (e.getKey().isDone() || e.getKey().isCancelled()) {
					it.remove();
				}
			}
		}, 1, 1, TimeUnit.MINUTES);

		SSLContext sslcontext = SSLContext.getInstance("SSL");
		sslcontext.init(null, new TrustManager[] { new TrustAnyTrustManager() }, new SecureRandom());

		RequestConfig config = RequestConfig.custom().setConnectTimeout(1000 * 3).setSocketTimeout(1000 * 5).build();

		PublicSuffixMatcher publicSuffixMatcher = PublicSuffixMatcherLoader.getDefault();
		DefaultHostnameVerifier hostnameVerifier = new DefaultHostnameVerifier(publicSuffixMatcher);

		SSLIOSessionStrategy sslStrategy = new SSLIOSessionStrategy(sslcontext, null, null, hostnameVerifier);

		CustomConnectingIOReactor ioreactor = new CustomConnectingIOReactor(IOReactorConfig.DEFAULT);

		final PoolingNHttpClientConnectionManager poolingmgr = new PoolingNHttpClientConnectionManager(ioreactor,
				RegistryBuilder.<SchemeIOSessionStrategy> create().register("http", NoopIOSessionStrategy.INSTANCE)
						.register("https", sslStrategy).build());
		poolingmgr.setMaxTotal(200);//最大连接数
		poolingmgr.setDefaultMaxPerRoute(200);//最大并发数

		HttpAsyncRequestExecutor eventHandler = new HttpAsyncRequestExecutor(
				HttpAsyncRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE, new CustomExceptionLogger());

		httpclient = HttpAsyncClients.custom().setSSLContext(sslcontext).setDefaultRequestConfig(config)
				.setConnectionManager(poolingmgr).setEventHandler(eventHandler).build();

		httpclient.start();
	}
	
	public int maxWork() {
		return queueSize;
	}
	
	public int numWorking() {
		return futures.size();
	}

	public void send(Notify notify, NotifyObserver observer) throws RejectedExecutionException {
		
		if (futures.size() > queueSize) {
			throw new RejectedExecutionException();
		}

		executor.execute(new Runnable() {
			@Override
			public void run() {
				new Callback(notify, observer).send();
			}
		});

	}

	public void close() throws IOException {
		httpclient.close();
	}

	class Callback implements FutureCallback<HttpResponse> {

		private Notify notify;

		private NotifyObserver observer;

		private volatile boolean success;

		private volatile String lastError;

		private volatile Future<HttpResponse> future;

		public Callback(Notify notify, NotifyObserver observer) {
			super();
			this.notify = notify;
			this.observer = observer;
		}

		public void send() {

			HttpPost post = null;
			if (StringUtils.isEmpty(proxyHost)) {
				post = new HttpPost(notify.getUrl().toString());
			} else {
				post = new HttpPost(proxyHost);
				post.addHeader("X-FORWARD-TO", notify.getUrl().toString());
			}

			if (notify.getParam() != null) {
				Iterator<BasicNameValuePair> it = notify.getParam().entrySet().stream()
						.map(o -> new BasicNameValuePair(o.getKey(), o.getValue().toString())).iterator();
				NStringEntity z = new NStringEntity(URLEncodedUtils.format(IteratorUtils.toList(it), charset),
						ContentType.create(URLEncodedUtils.CONTENT_TYPE, charset));
				post.setEntity(z);
			}

			future = httpclient.execute(post, new FutureCallbackCatcher<HttpResponse>(this));
			futures.put(future, future);
		}

		public void retry() {

//			failedCount++;
//			if (failedCount > notify.getMaxRetry()) {
//				logger.info("重试次数已达上限 {}", this);
//				observer.onFail(lastError);
//				return;
//			}
			
			observer.onFail(lastError);

//			logger.info("等待{}毫秒后第{}次重试 {}", notify.getRetryDelay(), failedCount, this);
//			// 重试
//			observer.onRetry(lastError);
//
//			Observable.just(this).delay(notify.getRetryDelay(), TimeUnit.MILLISECONDS).subscribe(o -> {
//				o.send();
//			});
		}

		@Override
		public void completed(HttpResponse result) {

			futures.remove(future);

			try {
				int bufSize = messageLoggerLength;
				// 只读取最前部分，节省内存消耗
				byte[] buf = new byte[bufSize];
				int l = result.getEntity().getContent().read(buf);
				l = Math.max(l, 0);
				String message = new String(buf, 0, l);
				
//				String message = IOUtils.toString(result.getEntity().getContent(), charset);
				logger.info("{}返回结果前{}个字节:{}", this, bufSize, StringUtils.left(message, bufSize));
				if (message.trim().equalsIgnoreCase("success")) {
					success = true;
				} else {
					lastError = message;
				}
			} catch (IOException e) {
				logger.info("通知发送失败,{} {} {}", e.getClass().getName(), e.getMessage(), this);
				lastError = e.getClass().getSimpleName() + ":" + e.getMessage();
			}

			if (!success) {
				retry();
			} else {
				observer.onSuccess(lastError);
			}
		}

		@Override
		public void failed(Exception ex) {
			if (future != null) {
				futures.remove(future);
			}

			logger.info("通知发送失败,{} {} {}", ex.getClass().getName(), ex.getMessage(), this, ex);
			lastError = ex.getClass().getSimpleName() + ":" + ex.getMessage();
			retry();
		}

		@Override
		public void cancelled() {
			if (future != null) {
				futures.remove(future);
			}
		}

		@Override
		public String toString() {
			return "[notify=" + notify + "]";
		}
	}
}
