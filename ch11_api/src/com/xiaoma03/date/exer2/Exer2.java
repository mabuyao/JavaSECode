package com.xiaoma03.date.exer2;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: Exer2
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/24 9:41
 * @Version 1.0
 */
public class Exer2 {
    @Test
    public void test1(){
        Calendar calendar = Calendar.getInstance();
        Date date1 = calendar.getTime();
        System.out.println("你的生日是：" + date1);

        calendar.add(Calendar.DAY_OF_YEAR, 100);
        Date date2 = calendar.getTime();
        System.out.println("100天后是：" + date2);

    }

    @Test
    public void test2(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("你的生日是：" + localDateTime);

        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println("100天后是：" + localDateTime1);
    }
}
