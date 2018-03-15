package com.lanmao.data.sync.dao.entity;

public class PaymentErrorCodeEntity {
    private Long id;

    private String payChannel;

    private String originErrorCode;

    private String errorCode;

    private String errorMessage;

    private String originMessage;

    private String errorType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getOriginErrorCode() {
        return originErrorCode;
    }

    public void setOriginErrorCode(String originErrorCode) {
        this.originErrorCode = originErrorCode;
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

    public String getOriginMessage() {
        return originMessage;
    }

    public void setOriginMessage(String originMessage) {
        this.originMessage = originMessage;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }
}