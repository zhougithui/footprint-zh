package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class AuthOrderEntity {
    private Long id;

    private String subjectNo;

    private String status;

    private String initiator;

    private String requestNo;

    private String authNo;

    private String cardNo;

    private String cardHolder;

    private String credNum;

    private String mobile;

    private String merchantOrderNo;

    private Date createTime;

    private Date completeTime;

    private String bank;

    private String authFactor;

    private String cnaps;

    private String authMode;

    private String bizType;

    private String merchantNo;

    private String authChannel;

    private String platform;

    private String errorCode;

    private String errorMessage;

    private String translateErrorCode;

    private String translateErrorMessage;

    private Long consumeTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }

    public String getRequestNo() {
        return requestNo;
    }

    public void setRequestNo(String requestNo) {
        this.requestNo = requestNo;
    }

    public String getAuthNo() {
        return authNo;
    }

    public void setAuthNo(String authNo) {
        this.authNo = authNo;
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

    public String getCredNum() {
        return credNum;
    }

    public void setCredNum(String credNum) {
        this.credNum = credNum;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getAuthFactor() {
        return authFactor;
    }

    public void setAuthFactor(String authFactor) {
        this.authFactor = authFactor;
    }

    public String getCnaps() {
        return cnaps;
    }

    public void setCnaps(String cnaps) {
        this.cnaps = cnaps;
    }

    public String getAuthMode() {
        return authMode;
    }

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    public String getBizType() {
        return bizType;
    }

    public void setBizType(String bizType) {
        this.bizType = bizType;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getAuthChannel() {
        return authChannel;
    }

    public void setAuthChannel(String authChannel) {
        this.authChannel = authChannel;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getTranslateErrorCode() {
        return translateErrorCode;
    }

    public void setTranslateErrorCode(String translateErrorCode) {
        this.translateErrorCode = translateErrorCode;
    }

    public String getTranslateErrorMessage() {
        return translateErrorMessage;
    }

    public void setTranslateErrorMessage(String translateErrorMessage) {
        this.translateErrorMessage = translateErrorMessage;
    }

    public Long getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Long consumeTime) {
        this.consumeTime = consumeTime;
    }
}