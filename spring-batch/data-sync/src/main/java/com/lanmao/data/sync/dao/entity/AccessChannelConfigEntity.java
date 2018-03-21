package com.lanmao.data.sync.dao.entity;

import java.util.Date;

/**
 * @author hui.zhou 15:07 2018/3/14
 */
public class AccessChannelConfigEntity {
    private long id;
    private String channel;
    private String channelAccessNo;
    private String accessSystemNo;
    private String encryptKey;
    private Date createTime;
    private Date modifyTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannelAccessNo() {
        return channelAccessNo;
    }

    public void setChannelAccessNo(String channelAccessNo) {
        this.channelAccessNo = channelAccessNo;
    }

    public String getAccessSystemNo() {
        return accessSystemNo;
    }

    public void setAccessSystemNo(String accessSystemNo) {
        this.accessSystemNo = accessSystemNo;
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
