package com.lanmao.data.sync.web;

import com.footprint.constants.CommonConstants;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameter;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.configuration.JobRegistry;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.JobOperator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author hui.zhou 10:28 2018/3/5
 */
@RestController
@RequestMapping("task")
public class TaskController {

    @Resource
    private JobRegistry jobRegistry;

    @Resource
    private JobLauncher jobLauncher;

    @Resource
    @Qualifier("simpleFileImportJob")
    private Job job;

    @Resource
    private JobOperator jobOperator;

    @RequestMapping("job")
    public String handle() throws Exception{
        JobExecution jobExecution = jobLauncher.run(job, new JobParameters());
        boolean stopYet = jobOperator.stop(jobOperator.getExecutions(jobExecution.getJobId()).iterator().next());
        return stopYet ? CommonConstants.SUCCESS : CommonConstants.FAIL;
    }

    @RequestMapping("run/{jobName}")
    public String handle(@PathVariable String jobName) throws Exception{
        Job curJob = jobRegistry.getJob(jobName);

        Map<String, JobParameter> jobParameterMap = new HashMap<>();
        jobParameterMap.put("start", new JobParameter(0l));
        jobParameterMap.put("end", new JobParameter(10_000l));
        JobExecution jobExecution = jobLauncher.run(curJob, new JobParameters(jobParameterMap));
        return jobExecution.getStatus().name();
    }

}
