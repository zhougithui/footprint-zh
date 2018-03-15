package com.lanmao.data.sync.dao.entity;

import java.util.Date;

public class AuthRouterEntity {
    private Long id;

    private String routerId;

    private String routerName;

    private Date createTime;

    private String status;

    private String authMode;

    private String routerStatus;

    private String businessSystem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRouterId() {
        return routerId;
    }

    public void setRouterId(String routerId) {
        this.routerId = routerId;
    }

    public String getRouterName() {
        return routerName;
    }

    public void setRouterName(String routerName) {
        this.routerName = routerName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAuthMode() {
        return authMode;
    }

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    public String getRouterStatus() {
        return routerStatus;
    }

    public void setRouterStatus(String routerStatus) {
        this.routerStatus = routerStatus;
    }

    public String getBusinessSystem() {
        return businessSystem;
    }

    public void setBusinessSystem(String businessSystem) {
        this.businessSystem = businessSystem;
    }
}