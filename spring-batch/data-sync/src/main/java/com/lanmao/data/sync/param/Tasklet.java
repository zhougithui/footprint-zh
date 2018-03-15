package com.lanmao.data.sync.param;

/**
 * 保存任务状态
 * @author hui.zhou 17:17 2018/3/12
 */
public class Tasklet {
    private String id;
    /**
     * 任务名称
     */
    private String jobName;

    /**
     * 开始节点
     */
    private String startPoint;

    private TaskStatus taskStatus;

    /**
     * 包序列
     */
    private int packetSeq;

    /**
     * 任务开始时间
     */
    private String startTime;

    /**
     * 任务结束时间
     * @return
     */
    private String endTime;

    /**
     * 描述，如果有错误则是错误描述
     */
    private String desc;

    private long succCount;

    private long failCount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public int getPacketSeq() {
        return packetSeq;
    }

    public void setPacketSeq(int packetSeq) {
        this.packetSeq = packetSeq;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public long getSuccCount() {
        return succCount;
    }

    public void setSuccCount(long succCount) {
        this.succCount = succCount;
    }

    public long getFailCount() {
        return failCount;
    }

    public void setFailCount(long failCount) {
        this.failCount = failCount;
    }
}
