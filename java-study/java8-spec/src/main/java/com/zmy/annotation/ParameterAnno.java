package com.zmy.annotation;

import java.lang.annotation.*;

/**
 * @author hui.zhou 13:12 2018/1/23
 */
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface ParameterAnno {
    int id();
    String name() default "zmy";
    int age();
}