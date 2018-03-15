package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class BatchAuthTaskEntity {
    private Long id;

    private String batchTaskName;

    private String status;

    private Date createTime;

    private Date updateTime;

    private String batchAuthMode;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBatchTaskName() {
        return batchTaskName;
    }

    public void setBatchTaskName(String batchTaskName) {
        this.batchTaskName = batchTaskName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getBatchAuthMode() {
        return batchAuthMode;
    }

    public void setBatchAuthMode(String batchAuthMode) {
        this.batchAuthMode = batchAuthMode;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}