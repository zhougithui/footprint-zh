package com.lanmao.data.sync.client.job;

import com.lanmao.data.sync.client.DefaultThreadFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 数据同步，一个线程池跑定时
 * @author hui.zhou 9:10 2018/3/12
 */
@Service
public class JobLauncher implements DisposableBean {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    public static ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(10, 10, 0, TimeUnit.SECONDS,
            new LinkedBlockingQueue<>(),new DefaultThreadFactory("data-sync-producer"), new DataSyncRejectedExecutionHandler());

    @Resource
    private TaskExecuteStrategy taskExecuteStrategy;

    /**
     * 指定开启任务
     * @param jobName
     * @param syncDay 同步日志  yyyyMMdd
     */
    public void startDataSync(String jobName, String syncDay){
        List<DataQueryTask> taskList = taskExecuteStrategy.map(jobName, syncDay);
        for(DataQueryTask task : taskList){
            poolExecutor.execute(task);
        }
        logger.info("开始执行任务{}，{}", jobName, syncDay);
    }

    @Override
    public void destroy() throws Exception {
        try {
            logger.info("关闭数据同步生产端线程池");
            poolExecutor.shutdown();
        } catch (Exception e) {
            logger.error("优雅关闭线程池失败");
        }
    }

    public void startDataSyncById(String jobName, long start, long offset) {
        List<DataQueryByIdTask> taskList = taskExecuteStrategy.map(jobName, start, offset);
        for(DataQueryByIdTask task : taskList){
            poolExecutor.execute(task);
        }
        logger.info("开始执行任务{}，{}，{}", jobName, start, offset);
    }
}

