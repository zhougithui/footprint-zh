package com.footprint.jdk8.test.time;

import org.junit.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 时间测试，只包含时分秒.毫秒
 */
public class LocalTimeTest {

    @Test
    public void testCreate(){
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        System.out.println(LocalTime.of(10, 20, 10, 10));
        System.out.println(LocalTime.parse("12:00:01"));
        System.out.println(LocalTime.parse("11:00:01", DateTimeFormatter.ofPattern("HH:mm:ss")));

    }
}
