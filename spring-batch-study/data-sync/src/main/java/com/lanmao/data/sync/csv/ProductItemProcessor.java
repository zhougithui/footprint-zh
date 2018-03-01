package com.lanmao.data.sync.csv;

import com.lanmao.data.sync.csv.vo.Product;
import org.springframework.batch.item.ItemProcessor;

import java.util.ArrayList;
import java.util.List;


public class ProductItemProcessor implements ItemProcessor<Product, Product> {

    @Override
    public Product process(Product product) throws Exception {
        List<Product> productList = new ArrayList<>();
        if (productList.size() > 0) {
            Product existingProduct = productList.get(0);
            product.setQuantity(existingProduct.getQuantity() + product.getQuantity());
        }
        System.out.println("对product进行处理");
        return product;
    }
}