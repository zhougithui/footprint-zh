package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class AuthRiskControlEntity {
    private Long id;

    private String cardHolder;

    private String credNum;

    private String credNum12;

    private String credNum6;

    private String cardNo;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getCredNum() {
        return credNum;
    }

    public void setCredNum(String credNum) {
        this.credNum = credNum;
    }

    public String getCredNum12() {
        return credNum12;
    }

    public void setCredNum12(String credNum12) {
        this.credNum12 = credNum12;
    }

    public String getCredNum6() {
        return credNum6;
    }

    public void setCredNum6(String credNum6) {
        this.credNum6 = credNum6;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}