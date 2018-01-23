package com.zmy.test.time;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

/**
 * 日期类
 * LocalDate是一个不可变的类，它表示默认格式(yyyy-MM-dd)的日期，
 * 我们可以使用now()方法得到当前时间，也可以提供输入年份、月份和日期的输入参数来创建一个LocalDate实例。
 * 该类为now()方法提供了重载方法，我们可以传入ZoneId来获得指定时区的日期。
 * 该类提供与java.sql.Date相同的功能，对于如何使用该类
 *
 * @author hui.zhou 15:13 2018/1/23
 */
public class LocalDateTest {
    /**
     * 创建日期
     */
    @Test
    public void testCreate(){
        /**
         * 默认日期格式yyyy-MM-dd，与java.util.Date不一样，重写了toString方法
         */
        //Current Date
        LocalDate today = LocalDate.now();
        System.out.println("当前日期=" + today);

        /**
         * 指定年月日创建日期
         */
        LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
        System.out.println("指定日期=" + firstDay_2014);

        //Try creating date by providing invalid inputs
        //LocalDate feb29_2014 = LocalDate.of(2014, Month.FEBRUARY, 29);
        //Exception in thread "main" java.time.DateTimeException:
        //Invalid date 'February 29' as '2014' is not a leap year

        /**
         * 指定时区创建日期
         */
        LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("当前日期 in IST=" + todayKolkata);

        //java.time.zone.ZoneRulesException: Unknown time-zone ID: IST
        //LocalDate todayIST = LocalDate.now(ZoneId.of("IST"));

        /**
         * 获取从01/01/1970开始的日期
         */
        LocalDate dateFromBase = LocalDate.ofEpochDay(365);
        System.out.println("01/01/1970 + 365天=" + dateFromBase);

        /**
         * 指定年份的第多少天
         */
        LocalDate hundredDay2018 = LocalDate.ofYearDay(2018, 100);
        System.out.println("2018年的第100天= " + hundredDay2018);
    }

    /**
     * 解析日期字符串
     */
    @Test
    public void testParse(){
        System.out.println(LocalDate.parse("2018-01-23"));
        System.out.println(LocalDate.parse("2018/01/23", DateTimeFormatter.ofPattern("yyyy/MM/dd")));
        System.out.println(LocalDate.parse("2018/01/23", DateTimeFormatter.ofPattern("yyyy/MM/dd", Locale.CHINA)));
    }

    /**
     * 日期转换
     */
    @Test
    public void testManipulate(){
        LocalDate today = LocalDate.now();

        // 取本月第1天：
        LocalDate firstDayOfThisMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(firstDayOfThisMonth);

        System.out.println("--------------分割线--------------");
        // 取本月第2天：
        LocalDate secondDayOfThisMonth = today.withDayOfMonth(2);
        System.out.println(secondDayOfThisMonth);

        // 取本月最后一天，再也不用计算是28，29，30还是31：
        LocalDate lastDayOfThisMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayOfThisMonth);

        System.out.println("--------------分割线--------------");
        // 取下一天：
        LocalDate firstDayOf = lastDayOfThisMonth.plusDays(1);
        System.out.println(firstDayOf);
        // 取2015年1月第一个周一，这个计算用Calendar要死掉很多脑细胞：
        LocalDate firstMondayOf2015 = LocalDate.parse("2015-01-01").with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)); // 2015-01-05
        System.out.println(firstMondayOf2015);
    }

    /**
     * 日期常量
     */
    @Test
    public void testConstants(){
        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);
    }

}
