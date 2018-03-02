package com.footprint.jdk8.concurency.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.CountDownLatch;

/**
 * String 处理任务
 */
public abstract class StringInputTask implements Task<String, String> {
    private final Logger logger = LoggerFactory.getLogger(getClass());
    private final String taskName;

    public StringInputTask(final String taskName) {
        this.taskName = taskName;
    }

    @Override
    public String process(final String input, final CountDownLatch latch) {
        //Some process that takes time
        try {
            Thread.sleep(3000);
            process(input);
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
        logger.debug("Done: " + taskName);
        latch.countDown();
        return  String.format("Task %s - %s - complete - Yay!", taskName, input);
    }

    /**
     * 子类处理
     * @param input
     * @return
     */
    public abstract String process(final String input);

    @Override
    public String toString() {
        return "StringInputTask{" +
                "taskName='" + taskName + '\'' +
                '}';
    }
}