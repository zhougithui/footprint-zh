package com.footprint.jdk8.test.annotation;

import com.footprint.jdk8.annotation.ParameterAnno;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * 很多地方都可以增加注解
 * 可以很方便的使用Checker框架进行诸如空指针检测等
 */
public class ParameterAnnoTest {

    public void test1(@ParameterAnno(id = 0, age = 0) String a) {

    }

    public static void main(String[] args) {
        Method[] m = ParameterAnnoTest.class.getDeclaredMethods();
        Annotation[][] an = null;
        for (Method method : m) {
            an = method.getParameterAnnotations();
            if (an.length > 0) {
                for (int i = 0; i < an.length; i++) {
                    for (int j = 0; j < an[i].length; j++) {
                        ParameterAnno t = (ParameterAnno) an[i][j];
                        System.out.println(method.getName() + "," + t.age() + "," + t.id() + "," + t.name());
                    }
                }
            }

        }
    }
}  