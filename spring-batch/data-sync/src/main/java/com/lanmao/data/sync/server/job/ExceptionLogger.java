package com.lanmao.data.sync.server.job;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author hui.zhou 9:34 2018/3/9
 */
public class ExceptionLogger implements Thread.UncaughtExceptionHandler {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        logger.error("消费线程异常{}-{}", t.getName(), e.getMessage());
    }
}
