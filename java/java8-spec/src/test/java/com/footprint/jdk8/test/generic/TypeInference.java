package com.footprint.jdk8.test.generic;

import com.footprint.jdk8.generic.Value;

/**
 * 泛型推断测试
 * java7会显示编译错误
 */
public class TypeInference {
    public static void main(String[] args) {
        final Value< String > value = new Value<>();
        //java7+
        value.getOrDefault( "22", Value.defaultValue() );
        //java7
        value.getOrDefault( "22", Value.<String>defaultValue() );
    }
}