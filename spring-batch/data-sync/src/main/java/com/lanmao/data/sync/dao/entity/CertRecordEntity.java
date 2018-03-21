package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class CertRecordEntity {
    private Long id;

    private String orderNo;

    private String status;

    private String certRequestNo;

    private String certChannel;

    private String certChannelOrderNo;

    private Date createTime;

    private Date completeTime;

    private String manageState;

    private String errorCode;

    private String errorMessage;

    private String detailInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCertRequestNo() {
        return certRequestNo;
    }

    public void setCertRequestNo(String certRequestNo) {
        this.certRequestNo = certRequestNo;
    }

    public String getCertChannel() {
        return certChannel;
    }

    public void setCertChannel(String certChannel) {
        this.certChannel = certChannel;
    }

    public String getCertChannelOrderNo() {
        return certChannelOrderNo;
    }

    public void setCertChannelOrderNo(String certChannelOrderNo) {
        this.certChannelOrderNo = certChannelOrderNo;
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

    public String getManageState() {
        return manageState;
    }

    public void setManageState(String manageState) {
        this.manageState = manageState;
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

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }
}