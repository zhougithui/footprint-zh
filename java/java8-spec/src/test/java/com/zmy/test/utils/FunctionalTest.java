package com.zmy.test.utils;

import com.zmy.test.common.Person;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.function.*;

/**
 * 测试java8提供的函数接口
 */
public class FunctionalTest {

    @Test
    public void testConsumer(){
        Consumer<String> biConsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                //消费一个参数
                System.out.println(s);
            }
        };
        biConsumer.accept("a");

        biConsumer = a -> System.out.println(a);
        biConsumer.accept("aa");
    }

    @Test
    public void testBiConsumer(){
        BiConsumer<String, String> biConsumer = new BiConsumer<String, String>() {
            @Override
            public void accept(String s, String s2) {
                //消费两个参数
                System.out.println(s + "-" + s2);
            }
        };
        biConsumer.accept("a", "b");

        biConsumer = (a, b) -> System.out.println(a + "-" + b);
        biConsumer.accept("aa", "bb");
    }

    @Test
    public void testDoubleConsumer(){
        DoubleConsumer consumer = new DoubleConsumer() {
            @Override
            public void accept(double value) {
                System.out.println(value);
            }
        };
        consumer.accept(1.1);
    }

    @Test
    public void testFunction(){
        Function<Integer, BigDecimal> bigDecimalBiFunction = new Function<Integer, BigDecimal>() {
            @Override
            public BigDecimal apply(Integer integer) {
                return BigDecimal.valueOf(100.1);
            }
        };
    }

    @Test
    public void testBiFunction(){
        BiFunction<String, Integer, BigDecimal> bigDecimalBiFunction = new BiFunction<String, Integer, BigDecimal>() {
            @Override
            public BigDecimal apply(String s, Integer integer) {
                return BigDecimal.valueOf(100.1);
            }
        };
    }

    @Test
    public void testBinaryOperator(){
        //BiFunction子接口  二元运算
        BinaryOperator<String> binaryOperator = new BinaryOperator<String>() {

            @Override
            public String apply(String s, String s2) {
                return s;
            }
        };
        System.out.println(binaryOperator.apply("c", "d"));


        System.out.println("--------------分割线--------------");

        /**
         * 比较两个person年级最大的
         */
        Person person = new Person();
        person.setAge(10);

        Person person1 = new Person();
        person1.setAge(100);

        Person person2 = (Person) BinaryOperator.maxBy(
                        Comparator.comparing(s -> {
                            return ((Person)s).getAge();
                        })
                ).apply(person, person1);
        System.out.println(person2.getAge());

        System.out.println("--------------分割线--------------");

        DoubleBinaryOperator doubleBinaryOperator = new DoubleBinaryOperator() {
            @Override
            public double applyAsDouble(double left, double right) {
                return left + right;
            }
        };
        System.out.println(doubleBinaryOperator.applyAsDouble(1.0, 2.1));
    }

    @Test
    public void testBiPredicate(){
        BiPredicate<String, Integer> biPredicate = new BiPredicate<String, Integer>() {
            @Override
            public boolean test(String s, Integer integer) {
                return s.equals("a") && integer > 10;
            }
        };
        System.out.println(biPredicate.test("a", 11));
    }

}
