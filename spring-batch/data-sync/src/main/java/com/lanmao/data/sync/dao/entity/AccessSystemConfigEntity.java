package com.lanmao.data.sync.dao.entity;

import java.util.Date;

/**
 * @author hui.zhou 15:09 2018/3/14
 */
public class AccessSystemConfigEntity {
    private long id;
    private String accessSystemNo;
    private String accessSystemName;
    private String callbackUrl;
    private String notifyUrl;
    private String encryptKey;
    private Date createTime;
    private Date modifyTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAccessSystemNo() {
        return accessSystemNo;
    }

    public void setAccessSystemNo(String accessSystemNo) {
        this.accessSystemNo = accessSystemNo;
    }

    public String getAccessSystemName() {
        return accessSystemName;
    }

    public void setAccessSystemName(String accessSystemName) {
        this.accessSystemName = accessSystemName;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getNotifyUrl() {
        return notifyUrl;
    }

    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
    }

    public String getEncryptKey() {
        return encryptKey;
    }

    public void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}
