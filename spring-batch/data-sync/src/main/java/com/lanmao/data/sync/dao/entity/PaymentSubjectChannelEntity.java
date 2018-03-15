package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class PaymentSubjectChannelEntity extends PaymentSubjectChannelEntityKey {
    private Date createTime;

    private Long orderNum;

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Long orderNum) {
        this.orderNum = orderNum;
    }
}