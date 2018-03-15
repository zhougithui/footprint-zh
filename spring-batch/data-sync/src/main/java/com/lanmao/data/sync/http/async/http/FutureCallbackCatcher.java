package com.lanmao.data.sync.http.async.http;

import org.apache.http.concurrent.FutureCallback;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FutureCallbackCatcher<T> implements FutureCallback<T> {
	
	private static final Logger logger = LoggerFactory.getLogger(FutureCallbackCatcher.class);

	private FutureCallback<T> origin = null;

	public FutureCallbackCatcher(FutureCallback<T> origin) {
		this.origin = origin;
	}

	@Override
	public void completed(T result) {
		try {
			origin.completed(result);
		} catch (Exception e) {
			logger.warn(e.getMessage(), e);
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	@Override
	public void failed(Exception ex) {
		try {
			origin.failed(ex);
		} catch (Exception e) {
			logger.warn(e.getMessage(), e);
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

	@Override
	public void cancelled() {
		try {
			origin.cancelled();
		} catch (Exception e) {
			logger.warn(e.getMessage(), e);
		} catch (Throwable e) {
			logger.error(e.getMessage(), e);
			throw e;
		}
	}

}
