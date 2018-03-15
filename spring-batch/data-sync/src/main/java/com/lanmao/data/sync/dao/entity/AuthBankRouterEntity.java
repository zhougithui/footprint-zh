package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class AuthBankRouterEntity {
    private Long id;

    private Long sourceRouter;

    private Long bankRouter;

    private String bankList;

    private Date createTime;

    private Date updateTime;

    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSourceRouter() {
        return sourceRouter;
    }

    public void setSourceRouter(Long sourceRouter) {
        this.sourceRouter = sourceRouter;
    }

    public Long getBankRouter() {
        return bankRouter;
    }

    public void setBankRouter(Long bankRouter) {
        this.bankRouter = bankRouter;
    }

    public String getBankList() {
        return bankList;
    }

    public void setBankList(String bankList) {
        this.bankList = bankList;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}