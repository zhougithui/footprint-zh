package com.footprint.jdk8.test.utils;

import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;

/**
 * @author hui.zhou 12:17 2018/1/26
 */
public class TemporalAdjustersTest {
    @Test
    public void testTemporalAdjusters(){
        TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.FRIDAY);
        TemporalAdjusters.firstDayOfMonth();
        TemporalAdjusters.firstDayOfNextMonth();
        TemporalAdjusters.firstDayOfNextYear();
        TemporalAdjusters.firstDayOfYear();
        TemporalAdjusters.firstInMonth(DayOfWeek.SATURDAY);
        TemporalAdjusters.next(DayOfWeek.SUNDAY);
        TemporalAdjusters.lastDayOfMonth();
        TemporalAdjusters.lastDayOfYear();
        TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY);
        TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY);
        TemporalAdjusters.ofDateAdjuster(date -> date);
        TemporalAdjusters.previous(DayOfWeek.SUNDAY);
        TemporalAdjusters.previousOrSame(DayOfWeek.SUNDAY);

        //日期调整器
        //LocalDate.now().with(null);
    }

}
