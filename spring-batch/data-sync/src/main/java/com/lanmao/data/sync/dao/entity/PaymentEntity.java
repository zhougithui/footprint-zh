package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class PaymentEntity {
    private Long id;

    private Long paymentOrderId;

    private String status;

    private Long orderAmount;

    private String currency;

    private String payWay;

    private String paySource;

    private String payAccount;

    private String payChannel;

    private String payChannelNo;

    private String payWayType;

    private String payTradeFlowNo;

    private String bankTradeFlowNo;

    private Date createTime;

    private Date paySuccessTime;

    private Date cancelTime;

    private String remark;

    private Date lastModifyTime;

    private String merchantNo;

    private String subMerchantNo;

    private Date completeTime;

    private String payCompany;

    private String errorCode;

    private String errorMessage;

    private String ip;

    private String settleday;

    private Date settleDay;

    private Date confirmTime;

    private String pendingStatus;

    private String translatedErrorCode;

    private String translatedErrorMessage;

    private String checkStatus;

    private Date checkTime;

    private String subjectNo;

    private String callType;

    private Long version;

    private Long consumeTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPaymentOrderId() {
        return paymentOrderId;
    }

    public void setPaymentOrderId(Long paymentOrderId) {
        this.paymentOrderId = paymentOrderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Long orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay;
    }

    public String getPaySource() {
        return paySource;
    }

    public void setPaySource(String paySource) {
        this.paySource = paySource;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getPayChannelNo() {
        return payChannelNo;
    }

    public void setPayChannelNo(String payChannelNo) {
        this.payChannelNo = payChannelNo;
    }

    public String getPayWayType() {
        return payWayType;
    }

    public void setPayWayType(String payWayType) {
        this.payWayType = payWayType;
    }

    public String getPayTradeFlowNo() {
        return payTradeFlowNo;
    }

    public void setPayTradeFlowNo(String payTradeFlowNo) {
        this.payTradeFlowNo = payTradeFlowNo;
    }

    public String getBankTradeFlowNo() {
        return bankTradeFlowNo;
    }

    public void setBankTradeFlowNo(String bankTradeFlowNo) {
        this.bankTradeFlowNo = bankTradeFlowNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPaySuccessTime() {
        return paySuccessTime;
    }

    public void setPaySuccessTime(Date paySuccessTime) {
        this.paySuccessTime = paySuccessTime;
    }

    public Date getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Date cancelTime) {
        this.cancelTime = cancelTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getLastModifyTime() {
        return lastModifyTime;
    }

    public void setLastModifyTime(Date lastModifyTime) {
        this.lastModifyTime = lastModifyTime;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getSubMerchantNo() {
        return subMerchantNo;
    }

    public void setSubMerchantNo(String subMerchantNo) {
        this.subMerchantNo = subMerchantNo;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public String getPayCompany() {
        return payCompany;
    }

    public void setPayCompany(String payCompany) {
        this.payCompany = payCompany;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSettleday() {
        return settleday;
    }

    public void setSettleday(String settleday) {
        this.settleday = settleday;
    }

    public Date getSettleDay() {
        return settleDay;
    }

    public void setSettleDay(Date settleDay) {
        this.settleDay = settleDay;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getPendingStatus() {
        return pendingStatus;
    }

    public void setPendingStatus(String pendingStatus) {
        this.pendingStatus = pendingStatus;
    }

    public String getTranslatedErrorCode() {
        return translatedErrorCode;
    }

    public void setTranslatedErrorCode(String translatedErrorCode) {
        this.translatedErrorCode = translatedErrorCode;
    }

    public String getTranslatedErrorMessage() {
        return translatedErrorMessage;
    }

    public void setTranslatedErrorMessage(String translatedErrorMessage) {
        this.translatedErrorMessage = translatedErrorMessage;
    }

    public String getCheckStatus() {
        return checkStatus;
    }

    public void setCheckStatus(String checkStatus) {
        this.checkStatus = checkStatus;
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Long getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Long consumeTime) {
        this.consumeTime = consumeTime;
    }
}