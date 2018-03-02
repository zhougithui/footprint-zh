package com.zmy.test.annotation;

import com.zmy.annotation.repeat.Filter;
import com.zmy.annotation.repeat.Filterable;

/**
 * 重复注解测试
 */
public class RepeatingAnnotations {

    public static void main(String[] args) {
        for (Filter filter : Filterable.class.getAnnotationsByType(Filter.class)) {
            System.out.println(filter.value());
        }
    }
}