package com.lanmao.data.sync.http.async.http;

import org.apache.http.impl.nio.reactor.DefaultConnectingIOReactor;
import org.apache.http.impl.nio.reactor.IOReactorConfig;
import org.apache.http.nio.reactor.IOReactorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;
import java.util.concurrent.ThreadFactory;

public class CustomConnectingIOReactor extends DefaultConnectingIOReactor {
	
	private Logger logger = LoggerFactory.getLogger(CustomConnectingIOReactor.class);

	public CustomConnectingIOReactor() throws IOReactorException {
		super();
	}

	public CustomConnectingIOReactor(IOReactorConfig config, ThreadFactory threadFactory) throws IOReactorException {
		super(config, threadFactory);
	}

	public CustomConnectingIOReactor(IOReactorConfig config) throws IOReactorException {
		super(config);
	}

	@Override
	protected void addExceptionEvent(Throwable ex, Date timestamp) {
		super.addExceptionEvent(ex, timestamp);
		logger.error("IOReactor出现致命错误:{}", ex.getMessage(), ex);
	}

}
