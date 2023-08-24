package com.xiaoma03.date.jdk8;

import org.junit.jupiter.api.Test;

import java.time.*;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DateTimeTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/23 17:28
 * @Version 1.0
 */
public class DateTimeTest {
    @Test
    public void test1(){
        String s1 = "hello";
        String s2 = s1.replace('l', 'w');//String的不可变性

        System.out.println(s1);
        System.out.println(s2);

        //体会Calendar的可变性
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, 22);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
    }

    @Test
    public void test2(){

        Date date1 = new Date(2023, 8, 23);
        System.out.println(date1);//Sun Sep 23 00:00:00 CST 3923
    }

    /*
    jdk8的api：localDate、localTime、localDateTime
     */
    @Test
    public void test3(){
        //now():获取当前的日期、时间、日期+时间
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);//2023-08-23
        System.out.println(localTime);//17:36:00.973
        System.out.println(localDateTime);//2023-08-23T17:36:00.973

        //of():设置指定的年、月、日、时、分、秒。没有偏移量
        LocalDate localDate1 = LocalDate.of(2023, 8, 23);
        LocalDateTime localDateTime1 = LocalDateTime.of(2023, 8, 23, 17, 38, 0);
        System.out.println(localDate1);//2023-08-23
        System.out.println(localDateTime1);//2023-08-23T17:38:00

        //getXxx():获取相关的属性
        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(localDateTime2.getDayOfMonth());//23

        LocalDateTime localDateTime3 = localDateTime2.withDayOfMonth(22);
        System.out.println(localDateTime2);//2023-08-23T17:42:45.222
        System.out.println(localDateTime3);//2023-08-22T17:42:45.222

        LocalDateTime localDateTime4 = localDateTime2.plusDays(5);
        System.out.println(localDateTime2);//2023-08-23T17:44:46.222
        System.out.println(localDateTime4);//2023-08-28T17:44:46.222
    }

    /*
    Instant的使用
     */

    @Test
    public void test4(){
        Instant instant = Instant.now();//默认获取UTC时区
        System.out.println(instant);//2023-08-23T09:55:10.522Z

        OffsetDateTime instant1 = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(instant1);//2023-08-23T17:55:10.522+08:00

        Instant instant2 = Instant.ofEpochMilli(1629695750522L);
        System.out.println(instant2);//2021-08-23T05:15:50.522Z

        long milliTime = instant.toEpochMilli();
        System.out.println(milliTime);//1692784717414

        System.out.println(new Date().getTime());
    }
}
