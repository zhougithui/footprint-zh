package com.lanmao.data.sync.http.async.http;

import org.apache.http.ExceptionLogger;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomExceptionLogger implements ExceptionLogger {
	
	private Logger logger = LoggerFactory.getLogger(CustomExceptionLogger.class);

	@Override
	public void log(Exception ex) {
		logger.error(ex.getMessage(), ex);
	}

}
