package com.lanmao.data.sync.csv.listener;

import com.lanmao.data.sync.csv.vo.Product;
import org.springframework.batch.core.ItemReadListener;

/**
 * 在 Read 开始之前(beforeRead)，之后(afterRead)和错误后(onReadError)触发
 */
public class SimpleItemReadListener implements ItemReadListener<Product> {

    @Override
    public void beforeRead() {
        System.out.println("SimpleItemReadListener.beforeRead");
    }

    @Override
    public void afterRead(Product item) {
        System.out.println("SimpleItemReadListener.afterRead -- " + item.getName());
    }

    @Override
    public void onReadError(Exception ex) {
        System.out.println("SimpleItemReadListener.onReadError");
    }

}