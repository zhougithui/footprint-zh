package com.lanmao.data.sync.csv;

import com.lanmao.data.sync.csv.vo.Product;
import org.springframework.batch.item.ItemWriter;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class ProductItemWriter implements ItemWriter<Product> {

    @Override
    public void write(List<? extends Product> products) throws Exception {
        System.out.println("开始写入数据库");
        for (Product product : products) {
            System.out.println(product.getName());
        }
        TimeUnit.SECONDS.sleep(10);
        //throw new RuntimeException("模拟异常重试");
    }
}