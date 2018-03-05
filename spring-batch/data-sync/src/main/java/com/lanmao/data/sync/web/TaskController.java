package com.lanmao.data.sync.web;

import com.footprint.constants.CommonConstants;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.JobOperator;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hui.zhou 10:28 2018/3/5
 */
@RestController
@RequestMapping("task")
public class TaskController {

    @Resource
    private JobLauncher jobLauncher;

    @Resource
    private Job job;

    @Resource
    private JobOperator jobOperator;

    @RequestMapping("job")
    public String handle() throws Exception{
        JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
        boolean stopYet = jobOperator.stop(jobOperator.getExecutions(jobExecution.getJobId()).iterator().next());
        return stopYet ? CommonConstants.SUCCESS : CommonConstants.FAIL;
    }
}
