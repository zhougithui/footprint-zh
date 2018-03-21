package com.lanmao.data.sync.client.param;

import java.util.List;

/**
 * 数据同步包
 * @author hui.zhou 16:44 2018/3/8
 */
public class DataSyncPacket {
    private String className;

    /**
     * 任务名称
     */
    private String jobName;

    /**
     * 开始节点
     */
    private String startPoint;

    /**
     * 检索范围
     */
    private String queryRange;

    /**
     * 包序列
     */
    private int packetSeq;

    private List<Object> datas;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Object> getDatas() {
        return datas;
    }

    public void setDatas(List<Object> datas) {
        this.datas = datas;
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

    public String getQueryRange() {
        return queryRange;
    }

    public void setQueryRange(String queryRange) {
        this.queryRange = queryRange;
    }
}
