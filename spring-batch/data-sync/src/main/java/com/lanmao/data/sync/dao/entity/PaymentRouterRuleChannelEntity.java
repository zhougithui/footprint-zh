package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class PaymentRouterRuleChannelEntity extends PaymentRouterRuleChannelEntityKey {
    private Long orderNum;

    private Date createTime;

    public Long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}