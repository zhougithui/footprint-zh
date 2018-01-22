package com.zmy.test.annotation;

import com.zmy.annotation.Holder;
import com.zmy.annotation.NonEmpty;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * 很多地方都可以增加注解
 * 可以很方便的使用Checker框架进行诸如空指针检测等
 */
public class HolderTest {

    public static void main(String[] args) throws NoSuchMethodException {
        final Holder<String> holder = new @NonEmpty Holder<>();

        Method method = holder.getClass().getDeclaredMethod("method", String.class);
        for(Parameter parameter : method.getParameters()){
            for(Annotation annotation : parameter.getAnnotations()){
                System.out.println(annotation.getClass().getName());
            }
        }
    }
}
