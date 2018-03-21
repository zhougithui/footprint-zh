package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class PaymentRouterSubjectRuleEntity extends PaymentRouterSubjectRuleEntityKey {
    private Date createTime;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}