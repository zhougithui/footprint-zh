package com.lanmao.data.sync.dao.entity;

public class PaymentCashreserveAccntEntity {
    private Long id;

    private String payCompany;

    private String cashreserveAccnt;

    private String accntName;

    private String openBankName;

    private String remark;

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

    public String getCashreserveAccnt() {
        return cashreserveAccnt;
    }

    public void setCashreserveAccnt(String cashreserveAccnt) {
        this.cashreserveAccnt = cashreserveAccnt;
    }

    public String getAccntName() {
        return accntName;
    }

    public void setAccntName(String accntName) {
        this.accntName = accntName;
    }

    public String getOpenBankName() {
        return openBankName;
    }

    public void setOpenBankName(String openBankName) {
        this.openBankName = openBankName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}