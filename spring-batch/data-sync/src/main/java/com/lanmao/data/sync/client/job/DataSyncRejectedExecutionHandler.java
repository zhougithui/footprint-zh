package com.lanmao.data.sync.client.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class DataSyncRejectedExecutionHandler implements RejectedExecutionHandler {
	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		logger.warn("不会发生的事情");
	}
	
}