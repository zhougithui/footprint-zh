package com.zmy.test.utils;

import javax.swing.text.html.Option;
import java.math.BigDecimal;
import java.util.Optional;

/**
 * Optional使用
 * @author hui.zhou 13:37 2018/1/23
 */
public class OptionalTest {
    public static void main(String[] args){
        Optional<Object> optional = Optional.empty();
        //判断相等
        System.out.println(optional.equals(Optional.empty()));

        System.out.println("---------------分割线-----------------");
        /**
         * 如果optional为空，则filter返回本身
         */
        System.out.println(optional.filter(x -> x.equals("aaa")).equals(Optional.of("abc")));
        optional = Optional.of("aaa");

        System.out.println("---------------分割线-----------------");
        /**
         * 如果optional不为空，则Predicate断言返回true时为本身，
         * 否则为Optional.empty
         * true
         */
        System.out.println(optional.filter(x -> x.equals("aaa")).equals(Optional.of("aaa")));

        System.out.println("---------------分割线-----------------");
        /**
         * 如果存在则消费Consumer
         * aaa
         */
        optional.ifPresent(System.out::println);

        System.out.println("---------------分割线-----------------");
        /**
         * 获取保存的值
         * aaa
         */
        System.out.println(optional.get());

        System.out.println("---------------分割线-----------------");
        /**
         * 如果optional为空则设置默认值
         * false
         * true
         */
        System.out.println(optional.orElse("fdsa").equals(Optional.of("fdsa")));
        System.out.println(Optional.empty().orElse("abc").equals("abc"));

        System.out.println("---------------分割线-----------------");
        /**
         * 可以进行map，类型转换，如果返回值为空则返回Optional.empty()
         */
        Optional<BigDecimal> bigDecimal = optional.map(t -> BigDecimal.TEN);
        System.out.println(bigDecimal.get());
    }
}
