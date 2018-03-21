package com.lanmao.data.sync.csv.listener;

import com.lanmao.data.sync.csv.vo.Product;
import org.springframework.batch.core.SkipListener;

/**
 * 在 Read 开始之前(beforeWrite)，之后(afterWrite)和错误后(onWriteError)触发
 */
public class SimpleSkipListener implements SkipListener<String, Product> {

    @Override
    public void onSkipInRead(Throwable t) {
        System.out.println("SimpleSkipListener.onSkipInRead");
    }

    @Override
    public void onSkipInWrite(Product item, Throwable t) {
        System.out.println("SimpleSkipListener.onSkipInWrite");
    }

    @Override
    public void onSkipInProcess(String item, Throwable t) {
        System.out.println("SimpleSkipListener.onSkipInProcess");
    }

}