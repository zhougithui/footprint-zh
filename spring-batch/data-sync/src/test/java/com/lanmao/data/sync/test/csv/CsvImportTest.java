package com.lanmao.data.sync.test.csv;

import org.springframework.batch.core.*;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hui.zhou 17:20 2018/3/1
 */
public class CsvImportTest {

    public static void main(String[] args){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("file-import-job.xml");
        ac.registerShutdownHook();
        SimpleJobLauncher launcher = ac.getBean(SimpleJobLauncher.class);

        Map<String,JobParameter> parameters = new HashMap<>();
        parameters.put("run.month",new JobParameter("2018-05"));
        JobExecution je = null;
        try {
            je = launcher.run((Job) ac.getBean("simpleFileImportJob"), new JobParameters(parameters));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(je);
        System.out.println(je.getJobInstance());
        System.out.println(je.getStepExecutions());
        ac.close();
    }
}
