package com.lanmao.data.sync.listener;

import com.lanmao.data.sync.csv.vo.Product;
import org.springframework.batch.core.ItemProcessListener;

/**
 * 在 Read 开始之前(beforeProcess)，之后(afterProcess)和错误后(onProcessError)触发
 */
public class SimpleItemProcessListener implements ItemProcessListener<Product, Product> {

    @Override
    public void beforeProcess(Product item) {
        System.out.println("SimpleItemProcessListener.beforeProcess");
    }

    @Override
    public void afterProcess(Product item, Product result) {
        System.out.println("SimpleItemProcessListener.afterProcess -- " + result.getName());
    }

    @Override
    public void onProcessError(Product item, Exception e) {
        System.out.println("SimpleItemProcessListener.onProcessError");
    }

}