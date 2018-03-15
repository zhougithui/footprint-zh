package com.lanmao.data.sync.csv.listener;

import com.lanmao.data.sync.csv.vo.Product;
import org.springframework.batch.core.ItemWriteListener;

import java.util.List;

/**
 * 在 Read 开始之前(beforeWrite)，之后(afterWrite)和错误后(onWriteError)触发
 */
public class SimpleItemWriteListener implements ItemWriteListener<Product> {

    @Override
    public void beforeWrite(List<? extends Product> items) {
        System.out.println("SimpleItemWriteListener.beforeWrite");
    }

    @Override
    public void afterWrite(List<? extends Product> items) {
        System.out.println("SimpleItemWriteListener.afterWrite");
    }

    @Override
    public void onWriteError(Exception exception, List<? extends Product> items) {
        System.out.println("SimpleItemWriteListener.onWriteError");
    }

}