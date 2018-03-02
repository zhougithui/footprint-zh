package com.footprint.test.utils;

import com.footprint.utils.DateLocalConvertUtils;
import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

/**
 * @author hui.zhou 11:06 2018/1/26
 */
public class DateLocalConvertTest {

    @Test
    public void testLocalDateToDate(){
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate = " + localDate);
        System.out.println("Date = " + DateLocalConvertUtils.localDateToDate(localDate));
    }

    @Test
    public void testDateToLocalDate(){
        Date date = new Date();
        System.out.println("Date = " + date);
        System.out.println("LocalDate = " + DateLocalConvertUtils.dateToLocalDate(date));
    }

    @Test
    public void testDateToLocalTime(){
        Date date = new Date();
        System.out.println("Date = " + date);
        System.out.println("LocalTime = " + DateLocalConvertUtils.dateToLocalTime(date));
    }

    @Test
    public void testLocalTimeToDate(){
        LocalTime localTime = LocalTime.now();
        System.out.println("Date = " + DateLocalConvertUtils.localTimeToDate(localTime, null));
        System.out.println("LocalTime = " + localTime);
    }

    @Test
    public void testLocalDateTimeToDate(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime = " + localDateTime);
        System.out.println("Date = " + DateLocalConvertUtils.localDateTimeToDate(localDateTime));
    }

    @Test
    public void testDateToLocalDateTime(){
        Date date = new Date();
        System.out.println("Date = " + date);
        System.out.println("LocalDateTime = " + DateLocalConvertUtils.dateToLocalDateTime(date));
    }
}
