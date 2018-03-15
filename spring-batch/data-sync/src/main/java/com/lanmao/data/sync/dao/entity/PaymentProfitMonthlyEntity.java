package com.lanmao.data.sync.dao.entity;

import java.math.BigDecimal;
import java.util.Date;

public class PaymentProfitMonthlyEntity {
    private Long id;

    private String payCompany;

    private String productName;

    private String merchantNo;

    private BigDecimal totalAmount;

    private Long totalCount;

    private Date profitMounth;

    private Long templetId;

    private BigDecimal profit;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayCompany() {
        return payCompany;
    }

    public void setPayCompany(String payCompany) {
        this.payCompany = payCompany;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
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

    public Date getProfitMounth() {
        return profitMounth;
    }

    public void setProfitMounth(Date profitMounth) {
        this.profitMounth = profitMounth;
    }

    public Long getTempletId() {
        return templetId;
    }

    public void setTempletId(Long templetId) {
        this.templetId = templetId;
    }

    public BigDecimal getProfit() {
        return profit;
    }

    public void setProfit(BigDecimal profit) {
        this.profit = profit;
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
}