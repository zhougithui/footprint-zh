package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class AuthMerchantAuthorizationEntity {
    private Long id;

    private Short authId;

    private String merchantNo;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getAuthId() {
        return authId;
    }

    public void setAuthId(Short authId) {
        this.authId = authId;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}