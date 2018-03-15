package com.lanmao.data.sync.param;

/**
 * 客户端消费情况
 * @author hui.zhou 11:06 2018/3/13
 */
public class ClientPoolInfo {

    private QueryPool queryPool;

    private Sender sender;

    public QueryPool getQueryPool() {
        return queryPool;
    }

    public void setQueryPool(QueryPool queryPool) {
        this.queryPool = queryPool;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }
}
