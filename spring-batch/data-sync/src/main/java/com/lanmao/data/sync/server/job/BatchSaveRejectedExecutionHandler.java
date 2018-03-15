package com.lanmao.data.sync.server.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

class BatchSaveRejectedExecutionHandler implements RejectedExecutionHandler {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		logger.warn("不可能发生的事情-2");
	}
	
}