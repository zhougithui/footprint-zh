package com.lanmao.data.sync.param;

/**
 * @author hui.zhou 13:04 2018/3/14
 */
public class MinMaxId {
    private long minId;
    private long maxId;
    private long idDiff;

    public long getMinId() {
        return minId;
    }

    public void setMinId(long minId) {
        this.minId = minId;
    }

    public long getMaxId() {
        return maxId;
    }

    public void setMaxId(long maxId) {
        this.maxId = maxId;
    }

    public long getIdDiff() {
        return idDiff;
    }

    public void setIdDiff(long idDiff) {
        this.idDiff = idDiff;
    }
}
