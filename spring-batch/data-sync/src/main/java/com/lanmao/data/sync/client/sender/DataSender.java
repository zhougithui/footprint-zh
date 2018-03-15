package com.lanmao.data.sync.client.sender;

import com.lanmao.data.sync.client.DefaultThreadFactory;
import com.lanmao.data.sync.client.job.DataSyncRejectedExecutionHandler;
import com.lanmao.data.sync.client.param.DataSyncPacket;
import com.lanmao.data.sync.http.async.AsyncNotifier;
import com.lanmao.data.sync.http.async.DefaultNotifyObserver;
import com.lanmao.data.sync.http.async.Notify;
import com.lanmao.data.sync.http.async.NotifyObserver;
import com.lanmao.data.sync.thread.DataSyncBlockQueue;
import com.lanmao.data.sync.server.job.ExceptionLogger;
import com.lanmao.data.sync.utils.GsonUtils;
import com.lanmao.runtime.util.http.HttpUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 数据发送器
 * @author hui.zhou 15:33 2018/3/8
 */
@Service
public class DataSender implements DisposableBean{
    private static final Logger logger = LoggerFactory.getLogger(DataSender.class);

    @Value("${server.url}")
    private String serverUrl;

    @Resource
    private AsyncNotifier asyncNotifier;
    private NotifyObserver observer = new DefaultNotifyObserver();

    /*线程池状态*/
    public static AtomicBoolean RUNNING = new AtomicBoolean(false);
    public static DataSyncBlockQueue<DataSyncPacket> packetBlockingQueue = new DataSyncBlockQueue<>();
    /**
     * 初始化任务
     */
    private synchronized void init() {
        logger.info("发送线程池初始化-START");
        //开启任务
        int size = poolExecutor.getCorePoolSize();

        for(int i=0; i<size; i++){
            Thread task = new SendTask();
            task.setUncaughtExceptionHandler(new ExceptionLogger());
            poolExecutor.execute(task);
        }
        logger.info("发送线程池初始化-END");
    }
    /**
     * 发送数据给服务器
     * @param dataSyncPacket
     */
    public void sendData(DataSyncPacket dataSyncPacket){
        if(RUNNING.compareAndSet(false, true)){
            init();
        }
        try {
            //logger.info("将数据包放入阻塞队列");
            packetBlockingQueue.put(dataSyncPacket);
        } catch (InterruptedException e) {
            logger.error("数据包放入队列失败，{}", dataSyncPacket);
        }
    }

    public static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(10, 10, 10, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(),new DefaultThreadFactory("data-sync-sender"), new DataSyncRejectedExecutionHandler());

    @Override
    public void destroy() throws Exception {
        if(RUNNING.compareAndSet(true, false)){
            try {
                logger.info("关闭数据同步发送端线程池");
                TimeUnit.SECONDS.sleep(3);
                poolExecutor.shutdown();
            } catch (Exception e) {
                logger.warn("数据同步发送线程池释放资源失败");
            }
        }
    }

    /**
     * 增加线程数
     * @param size
     */
    public void incrementPoolSize(int size) {
        logger.info("调整发送线程数，增加{}", size);
        for(int i=0; i<size; i++){
            Thread task = new SendTask();
            task.setUncaughtExceptionHandler(new ExceptionLogger());
            poolExecutor.execute(task);
        }
        logger.info("调整发送线程数完毕");
    }

    class SendTask extends Thread {

        @Override
        public void run() {
            try {
                while(RUNNING.get()) {
                    DataSyncPacket dataSyncPacket = packetBlockingQueue.take();
                    Map<String, String> paramMap = new HashMap<>();
                    paramMap.put("dataSyncPacket", GsonUtils.buildGson().toJson(dataSyncPacket));
                    try {
                        Notify notify = new Notify(
                                dataSyncPacket.getQueryRange() + "/" + dataSyncPacket.getPacketSeq(),
                                new URL(serverUrl + "sync/receive"),
                                "",
                                paramMap,
                                "send data");
                        asyncNotifier.send(notify, observer);
                        /*String succ = HttpUtils.post(new URL(serverUrl + "sync/receive"), Charset.forName("UTF-8"), paramMap);
                        if(!StringUtils.equals("SUCCESS", GsonUtils.buildGson().fromJson(succ, String.class))){
                            logger.error("向服务器推送数据失败，{}", succ);
                        }*/
                    } catch (IOException e) {
                        logger.error("向服务器推送数据失败{}", e.getMessage());
                    }
                    //logger.info("向服务器推送数据,{}", counter.getAndIncrement());
                }
            } catch (InterruptedException e) {
                logger.error("线程中断异常，", e);
                Thread.currentThread().interrupt();
            } catch (Exception e) {
                logger.error("数据发送给服务器出现异常", e);
            }
        }
    }

    //public static AtomicInteger counter = new AtomicInteger(0);
}
