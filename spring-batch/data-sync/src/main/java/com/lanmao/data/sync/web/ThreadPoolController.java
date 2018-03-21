package com.lanmao.data.sync.web;

import com.lanmao.data.sync.client.job.JobLauncher;
import com.lanmao.data.sync.client.sender.DataSender;
import com.lanmao.data.sync.param.ClientPoolInfo;
import com.lanmao.data.sync.param.QueryPool;
import com.lanmao.data.sync.param.Sender;
import com.lanmao.data.sync.param.ServerPoolInfo;
import com.lanmao.data.sync.server.job.BatchSaveDataJobLauncher;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author hui.zhou 11:02 2018/3/13
 */
@Controller
@RequestMapping("pool")
public class ThreadPoolController {
    @Resource
    private DataSender sender;
    @Resource
    private BatchSaveDataJobLauncher saveDataJobLauncher;

    @RequestMapping("monitor/{who}")
    @ResponseBody
    public Object poolStatus(@PathVariable String who){
        if(StringUtils.equals("c", who)){
            ClientPoolInfo poolInfo = new ClientPoolInfo();
            QueryPool queryPool = new QueryPool();
            queryPool.setActiveCount(JobLauncher.poolExecutor.getActiveCount());
            queryPool.setCompletedTaskCount(JobLauncher.poolExecutor.getCompletedTaskCount());
            queryPool.setLargestPoolSize(JobLauncher.poolExecutor.getLargestPoolSize());
            queryPool.setPoolSize(JobLauncher.poolExecutor.getCorePoolSize());
            queryPool.setTaskCount(JobLauncher.poolExecutor.getTaskCount());
            queryPool.setName("data-sync-producer");

            Sender sender = new Sender();
            sender.setActiveCount(DataSender.poolExecutor.getActiveCount());
            sender.setCompletedTaskCount(DataSender.packetBlockingQueue.getEleCount().get());
            sender.setLargestPoolSize(DataSender.poolExecutor.getLargestPoolSize());
            sender.setPoolSize(DataSender.poolExecutor.getCorePoolSize());
            sender.setInQueueSize(DataSender.packetBlockingQueue.size());
            sender.setName("data-sync-sender");

            poolInfo.setQueryPool(queryPool);
            poolInfo.setSender(sender);
            return poolInfo;
        }
        if(StringUtils.equals("s", who)){
            ServerPoolInfo poolInfo = new ServerPoolInfo();
            poolInfo.setActiveCount(BatchSaveDataJobLauncher.poolExecutor.getActiveCount());
            poolInfo.setCompletedTaskCount(BatchSaveDataJobLauncher.queue.getEleCount().get());
            poolInfo.setLargestPoolSize(BatchSaveDataJobLauncher.poolExecutor.getLargestPoolSize());
            poolInfo.setPoolSize(BatchSaveDataJobLauncher.poolExecutor.getCorePoolSize());
            poolInfo.setInQueueSize(BatchSaveDataJobLauncher.queue.size());
            poolInfo.setName("data-sync-consumer");
            return poolInfo;
        }
        return "错误的监控对象（只能c或者s）";
    }

    @RequestMapping("adjust/{name}/{size}")
    @ResponseBody
    public String ajustPool(@PathVariable String name, @PathVariable int size){
        if(StringUtils.equals("data-sync-producer", name)){
            JobLauncher.poolExecutor.setCorePoolSize(size);
            JobLauncher.poolExecutor.setMaximumPoolSize(size);
        }
        else if(StringUtils.equals("data-sync-sender", name)){
            int corePoolSize = DataSender.poolExecutor.getCorePoolSize();
            DataSender.poolExecutor.setCorePoolSize(size);
            DataSender.poolExecutor.setMaximumPoolSize(size);

            if(corePoolSize < size){
                sender.incrementPoolSize(size - corePoolSize);
            }
        }
        else if(StringUtils.equals("data-sync-consumer", name)){
            int corePoolSize = BatchSaveDataJobLauncher.poolExecutor.getCorePoolSize();
            BatchSaveDataJobLauncher.poolExecutor.setCorePoolSize(size);
            BatchSaveDataJobLauncher.poolExecutor.setMaximumPoolSize(size);

            if(corePoolSize < size){
                saveDataJobLauncher.incrementPoolSize(size - corePoolSize);
            }
        }
        else {
            return "线程池名称不正确（只能为data-sync-producer或者data-sync-sender或者data-sync-consumer）";
        }
        return "SUCCESS";
    }
}
