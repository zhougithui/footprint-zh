package com.lanmao.data.sync.client.param;

import java.util.Date;

/**
 * 统一分页查询参数
 * @author hui.zhou 9:09 2018/3/9
 */
public class PageQueryParam {
    private int pageSize = 50;
    private int currentPage = 1;

    private Date startTime;
    private Date endTime;

    private Long startId;
    private Long endId;

    private int start = 0;
    private int end = currentPage * pageSize;

    private String tableName;

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void nextPage(){
        this.start = end;
        this.currentPage++;
        this.end = currentPage * pageSize;
    }

    public Long getStartId() {
        return startId;
    }

    public void setStartId(Long startId) {
        this.startId = startId;
    }

    public Long getEndId() {
        return endId;
    }

    public void setEndId(Long endId) {
        this.endId = endId;
    }
}
