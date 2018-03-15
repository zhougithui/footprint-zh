package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class PaymentCompanyEntity {
    private Long id;

    private String payCompanyName;

    private String shortName;

    private String payCompany;

    private String profitType;

    private Date createTime;

    private Date updateTime;

    private String systemType;

    private String whiteList;

    private String supportSystem;

    private String contact;

    private String checkFile;

    private String smsRule;

    private String supportBank;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayCompanyName() {
        return payCompanyName;
    }

    public void setPayCompanyName(String payCompanyName) {
        this.payCompanyName = payCompanyName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getPayCompany() {
        return payCompany;
    }

    public void setPayCompany(String payCompany) {
        this.payCompany = payCompany;
    }

    public String getProfitType() {
        return profitType;
    }

    public void setProfitType(String profitType) {
        this.profitType = profitType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType;
    }

    public String getWhiteList() {
        return whiteList;
    }

    public void setWhiteList(String whiteList) {
        this.whiteList = whiteList;
    }

    public String getSupportSystem() {
        return supportSystem;
    }

    public void setSupportSystem(String supportSystem) {
        this.supportSystem = supportSystem;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCheckFile() {
        return checkFile;
    }

    public void setCheckFile(String checkFile) {
        this.checkFile = checkFile;
    }

    public String getSmsRule() {
        return smsRule;
    }

    public void setSmsRule(String smsRule) {
        this.smsRule = smsRule;
    }

    public String getSupportBank() {
        return supportBank;
    }

    public void setSupportBank(String supportBank) {
        this.supportBank = supportBank;
    }
}