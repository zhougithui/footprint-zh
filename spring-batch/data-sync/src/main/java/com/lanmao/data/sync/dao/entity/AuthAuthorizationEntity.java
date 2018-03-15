package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class AuthAuthorizationEntity {
    private Long id;

    private String authChannel;

    private String merchantNo;

    private String authorizationNo;

    private String cardNo;

    private String cardHolder;

    private String mobile;

    private String credNum;

    private Date createTime;

    private String status;

    private String authFactor;

    private Date expiryDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthChannel() {
        return authChannel;
    }

    public void setAuthChannel(String authChannel) {
        this.authChannel = authChannel;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getAuthorizationNo() {
        return authorizationNo;
    }

    public void setAuthorizationNo(String authorizationNo) {
        this.authorizationNo = authorizationNo;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(String cardHolder) {
        this.cardHolder = cardHolder;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCredNum() {
        return credNum;
    }

    public void setCredNum(String credNum) {
        this.credNum = credNum;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuthFactor() {
        return authFactor;
    }

    public void setAuthFactor(String authFactor) {
        this.authFactor = authFactor;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}