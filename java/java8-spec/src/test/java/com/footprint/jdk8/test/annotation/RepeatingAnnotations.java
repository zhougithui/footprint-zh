package com.footprint.jdk8.test.annotation;

import com.footprint.jdk8.annotation.repeat.Filterable;
import com.footprint.jdk8.annotation.repeat.Filter;

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