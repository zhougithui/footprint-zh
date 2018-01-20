package com.zmy.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * lambda表达式
 * (params) -> expression
 * (params) -> statement
 * (params) -> { statements }
 */
public class LambdaTest {
    public static void main(String[] args){
        //test1();

        String condition = "abc";
        testPredicate(condition, (s) -> {
            System.out.println(s.getClass().getName());
            return s.equals("abc");
        });
    }

    /**
     * 线程
     */
    public static void test1(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread test");
            }
        }).start();

        new Thread(() -> System.out.println("thread lambda test")).start();
    }

    /**
     * 集合遍历
     */
    public static void test2(){
        List<String> list = Arrays.asList("a", "b", "c", "d");
        for (String s : list){
            System.out.println(s);
        }

        list.forEach(System.out::println);
        list.forEach((s) -> System.out.println(s));
    }

    /**
     * condition 使用
     * @param condition
     */
    public static <T> void testPredicate(T input, Predicate<T> condition){
        if(condition.test(input)){
            System.out.println("test true");
        }
    }

}
