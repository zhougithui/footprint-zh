package com.lanmao.data.sync.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentOrderCountEntity {
    private Long id;

    private Date countDate;

    private String platform;

    private String subjectNo;

    private String merchantName;

    private String payCompany;

    private String payProduct;

    private String status;

    private BigDecimal timeAvg;

    private Short timeBelow5;

    private Short timeBelow10;

    private Short timeBelow30;

    private Short timeAbove30;

    private BigDecimal totalAmount;

    private Long totalCount;

    private Long unfinishCount;

    private Date createTime;

    private String merchantShortName;

    private Long unconfirmedCount;

    private String userRole;

    private String userType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCountDate() {
        return countDate;
    }

    public void setCountDate(Date countDate) {
        this.countDate = countDate;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getSubjectNo() {
        return subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public String getMerchantName() {
        return merchantName;
    }

    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    public String getPayCompany() {
        return payCompany;
    }

    public void setPayCompany(String payCompany) {
        this.payCompany = payCompany;
    }

    public String getPayProduct() {
        return payProduct;
    }

    public void setPayProduct(String payProduct) {
        this.payProduct = payProduct;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTimeAvg() {
        return timeAvg;
    }

    public void setTimeAvg(BigDecimal timeAvg) {
        this.timeAvg = timeAvg;
    }

    public Short getTimeBelow5() {
        return timeBelow5;
    }

    public void setTimeBelow5(Short timeBelow5) {
        this.timeBelow5 = timeBelow5;
    }

    public Short getTimeBelow10() {
        return timeBelow10;
    }

    public void setTimeBelow10(Short timeBelow10) {
        this.timeBelow10 = timeBelow10;
    }

    public Short getTimeBelow30() {
        return timeBelow30;
    }

    public void setTimeBelow30(Short timeBelow30) {
        this.timeBelow30 = timeBelow30;
    }

    public Short getTimeAbove30() {
        return timeAbove30;
    }

    public void setTimeAbove30(Short timeAbove30) {
        this.timeAbove30 = timeAbove30;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getUnfinishCount() {
        return unfinishCount;
    }

    public void setUnfinishCount(Long unfinishCount) {
        this.unfinishCount = unfinishCount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getMerchantShortName() {
        return merchantShortName;
    }

    public void setMerchantShortName(String merchantShortName) {
        this.merchantShortName = merchantShortName;
    }

    public Long getUnconfirmedCount() {
        return unconfirmedCount;
    }

    public void setUnconfirmedCount(Long unconfirmedCount) {
        this.unconfirmedCount = unconfirmedCount;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}