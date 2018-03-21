package com.lanmao.data.sync.thread;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author hui.zhou 12:38 2018/3/13
 */
public class DataSyncBlockQueue<E> extends LinkedBlockingQueue<E> {
    private AtomicLong eleCount = new AtomicLong(0);

    public AtomicLong getEleCount() {
        return eleCount;
    }

    public void setEleCount(AtomicLong eleCount) {
        this.eleCount = eleCount;
    }

    @Override
    public E take() throws InterruptedException {
        E ele = super.take();
        eleCount.incrementAndGet();
        return ele;
    }

    @Override
    public E poll(long timeout, TimeUnit unit) throws InterruptedException {
        E ele = super.poll(timeout, unit);
        if(ele != null){
            eleCount.incrementAndGet();
        }
        return ele;
    }
}
