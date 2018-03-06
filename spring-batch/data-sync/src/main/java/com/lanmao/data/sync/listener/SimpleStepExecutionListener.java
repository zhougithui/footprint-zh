package com.lanmao.data.sync.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

/**
 * 在 Step 开始之前(beforeStep)和之后(afterStep)触发
 */
public class SimpleStepExecutionListener implements StepExecutionListener {

    @Override
    public void beforeStep(StepExecution stepExecution) {
        System.out.println("SimpleStepExecutionListener.beforeStep");
    }

    @Override
    public ExitStatus afterStep(StepExecution stepExecution) {
        System.out.println("SimpleStepExecutionListener.afterStep");
        return stepExecution.getExitStatus();
    }

}