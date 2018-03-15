package com.lanmao.data.sync.client.job;

import com.lanmao.data.SpringUtils;
import com.lanmao.data.sync.client.param.DataSyncPacket;
import com.lanmao.data.sync.client.param.PageQueryParam;
import com.lanmao.data.sync.client.sender.DataSender;
import com.lanmao.data.sync.client.service.DataQueryService;
import com.lanmao.data.sync.param.TaskStatus;
import com.lanmao.data.sync.param.Tasklet;
import com.lanmao.data.sync.redis.RedisUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.TimeUnit;

class DataQueryByIdTask extends Thread{
    private final Logger logger = LoggerFactory.getLogger(getClass());

    private DataQueryService queryService;

    private String jobName;
    /**
     * 开始节点
     */
    private String startPoint;

    /**
     * 当前任务范围
     */
    private long startId;
    private long endId;

    DataQueryByIdTask(String jobName, DataQueryService queryService){
        this.jobName = jobName;
        this.queryService = queryService;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public long getStartId() {
        return startId;
    }

    public void setStartId(long startId) {
        this.startId = startId;
    }

    public long getEndId() {
        return endId;
    }

    public void setEndId(long endId) {
        this.endId = endId;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    @Override
    public void run() {
        PageQueryParam param = new PageQueryParam();
        param.setStartId(startId);
        param.setEndId(endId);

        boolean hasNext = true;
        while (hasNext){
            List<Object> objList = queryService.queryList(jobName, param);
            if(objList != null && !objList.isEmpty()){
                //是否拥有下一页
                if(objList.size() < param.getPageSize()){
                    hasNext = false;
                    //logger.info("读取到末尾，无需分页");
                }else{
                    //翻页
                    param.nextPage();
                }

                //封装参数给发送器，推送到服务器端
                DataSyncPacket dataSyncPacket = new DataSyncPacket();
                dataSyncPacket.setClassName(objList.get(0).getClass().getName());
                dataSyncPacket.setJobName(jobName);
                dataSyncPacket.setPacketSeq(param.getCurrentPage() - 1);
                dataSyncPacket.setStartPoint(startPoint);
                dataSyncPacket.setQueryRange(startId + "/" + endId);
                dataSyncPacket.setDatas(objList);

                try {
                    Tasklet tasklet = new Tasklet();
                    tasklet.setJobName(jobName);
                    tasklet.setStartPoint(startPoint);
                    tasklet.setTaskStatus(TaskStatus.RUNNING);
                    tasklet.setStartTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss")));
                    tasklet.setId(dataSyncPacket.getQueryRange() + "/" + dataSyncPacket.getPacketSeq());

                    RedisUtils.hset(jobName, tasklet.getId(), tasklet, 1l, TimeUnit.DAYS);

                    //发送数据
                    //logger.info("发送数据页，{}", tasklet.getId());
                    SpringUtils.getBean(DataSender.class).sendData(dataSyncPacket);
                } catch (Exception e) {
                    logger.error("数据发送失败", e);
                }
            }else{
                hasNext = false;
                //logger.info("数据查询为空");
            }
        }

        //logger.info("数据检索任务完成");
    }
}