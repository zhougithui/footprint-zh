package com.lanmao.data.sync.csv;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersIncrementer;

public class SimpleIncrementer implements JobParametersIncrementer {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public JobParameters getNext(JobParameters parameters) {
        logger.info("SampleIncrementer.......");
        if (parameters==null || parameters.isEmpty()) {
            return new JobParametersBuilder().addLong("run.id", 1L).toJobParameters();
        }
        long id = parameters.getLong("run.id",1L) + 1;
        return new JobParametersBuilder().addLong("run.id", id).toJobParameters();
    }
}