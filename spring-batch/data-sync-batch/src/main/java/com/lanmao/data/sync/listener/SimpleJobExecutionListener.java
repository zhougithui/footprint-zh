package com.lanmao.data.sync.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

/**
 * 在 Job 开始之前(beforeJob)和之后(afterJob)触发
 */
public class SimpleJobExecutionListener implements JobExecutionListener {

    @Override
    public void beforeJob(JobExecution jobExecution) {
        System.out.println("SimpleJobExecutionListener.beforeJob");
    }

    @Override
    public void afterJob(JobExecution jobExecution) {
        System.out.println("SimpleJobExecutionListener.afterJob");
    }

}