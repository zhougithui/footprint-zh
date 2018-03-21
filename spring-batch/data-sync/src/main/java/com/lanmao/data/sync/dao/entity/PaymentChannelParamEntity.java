package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class PaymentChannelParamEntity {
    private Long id;

    private Long payCompanyId;

    private String payChannel;

    private String payChannelName;

    private String channelType;

    private String channelSetting;

    private Date createTime;

    private Date updateTime;

    private String channelDetail;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPayCompanyId() {
        return payCompanyId;
    }

    public void setPayCompanyId(Long payCompanyId) {
        this.payCompanyId = payCompanyId;
    }

    public String getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(String payChannel) {
        this.payChannel = payChannel;
    }

    public String getPayChannelName() {
        return payChannelName;
    }

    public void setPayChannelName(String payChannelName) {
        this.payChannelName = payChannelName;
    }

    public String getChannelType() {
        return channelType;
    }

    public void setChannelType(String channelType) {
        this.channelType = channelType;
    }

    public String getChannelSetting() {
        return channelSetting;
    }

    public void setChannelSetting(String channelSetting) {
        this.channelSetting = channelSetting;
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

    public String getChannelDetail() {
        return channelDetail;
    }

    public void setChannelDetail(String channelDetail) {
        this.channelDetail = channelDetail;
    }
}