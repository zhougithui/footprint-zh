package com.lanmao.data.sync.client.job;

import com.lanmao.data.sync.client.service.DataQueryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hui.zhou 9:46 2018/3/9
 */
@Service
public class TaskExecuteStrategy {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Resource
    private DataQueryService queryService;

    ExceptionLogger exceptionLogger = new ExceptionLogger();
    /**
     * syncDate每天按照日期执行
     * 1、0-8  作为一个批次
     * 2、9-0  每个小时作为一个批次
     */
    public List<DataQueryTask> map(String jobName, String syncDay){
        List<DataQueryTask> taskList = new ArrayList<>();

        DataQueryTask task = new DataQueryTask(jobName, queryService);
        task.setUncaughtExceptionHandler(exceptionLogger);
        task.setSyncDay(syncDay);
        task.setStartTime(syncDay + "000000");
        task.setEndTime(syncDay + "090000");

        taskList.add(task);

        for(int i = 9; i <= 24; i++){
            DataQueryTask oneHourTask = new DataQueryTask(jobName, queryService);
            oneHourTask.setUncaughtExceptionHandler(exceptionLogger);
            oneHourTask.setSyncDay(syncDay);
            oneHourTask.setStartTime(syncDay + (i > 9 ? (i + "0000") : ("0" + i + "0000")));
            oneHourTask.setEndTime(syncDay + (i >= 9 ? (i + 1 + "0000") : ("0" + (i + 1) + "0000")));
            if(i == 24){
                oneHourTask.setEndTime(syncDay + "000000");
            }

            //logger.info("任务时间范围：" + oneHourTask.getStartTime() + "/" + oneHourTask.getEndTime());
            taskList.add(oneHourTask);
        }
        return taskList;
    }

    /**
     * 1万条作为一个task
     * @param jobName
     * @param start
     * @param offset
     * @return
     */
    public List<DataQueryByIdTask> map(String jobName, long start, long offset) {
        List<DataQueryByIdTask> taskList = new ArrayList<>();

        long taskSize = (offset-start) / 10_000l + 1;
        for(int i=1; i<=taskSize; i++){
            DataQueryByIdTask task = new DataQueryByIdTask(jobName, queryService);
            task.setStartPoint(start + "");
            task.setStartId(start + 10_000 * (i-1));
            task.setEndId(start + 10_000 * i);
            task.setUncaughtExceptionHandler(exceptionLogger);

            taskList.add(task);
        }
        return taskList;
    }

}
