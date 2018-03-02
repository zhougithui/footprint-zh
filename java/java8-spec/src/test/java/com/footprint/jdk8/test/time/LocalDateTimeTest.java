package com.footprint.jdk8.test.time;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * 新时间API
 * @author hui.zhou 14:41 2018/1/23
 */
public class LocalDateTimeTest {
    public static void main(String[] args){
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Shanghai")));
    }
}
