package com.lanmao.data.sync.csv;

import com.lanmao.data.sync.csv.vo.Product;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

/**
 * 根据 CSV 文件中的字段集合构建 Product 对象
 */
public class ProductFieldSetMapper implements FieldSetMapper<Product> {

    @Override
    public Product mapFieldSet(FieldSet fieldSet) throws BindException {
        Product product = new Product();
        product.setId(fieldSet.readInt("id"));
        product.setName(fieldSet.readString("name"));
        product.setDescription(fieldSet.readString("description"));
        product.setQuantity(fieldSet.readInt("quantity"));
        return product;
    }
}