package com.zmy.test.generic;

/**
 * @author hui.zhou 16:41 2018/1/26
 */
public class GenericTest<R> {
    public static void main(String[] args){
        new GenericTest<String>().f("fdsa");
    }

    public static <T> void test(T obj){

    }

    public void f(R obj){
        System.out.println(obj.getClass().getName());
    }
}
