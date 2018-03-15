package com.lanmao.data.sync.dao.entity;

public class AuthErrorCodeEntity {
    private Long id;

    private String authChannel;

    private String originErrorCode;

    private String originMessage;

    private String errorCode;

    private String errorMessage;

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

    public String getOriginErrorCode() {
        return originErrorCode;
    }

    public void setOriginErrorCode(String originErrorCode) {
        this.originErrorCode = originErrorCode;
    }

    public String getOriginMessage() {
        return originMessage;
    }

    public void setOriginMessage(String originMessage) {
        this.originMessage = originMessage;
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
}