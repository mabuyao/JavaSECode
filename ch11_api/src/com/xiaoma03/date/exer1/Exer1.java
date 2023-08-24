package com.xiaoma03.date.exer1;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Exer1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/23 17:05
 * @Version 1.0
 */
public class Exer1 {
    @Test
    public void test1(){
        Date date1 = new Date();
        //错误的
        //java.sql.Date date2 = (java.sql.Date) date1;

        //正确的
        java.sql.Date date3 = new java.sql.Date(date1.getTime());
        System.out.println(date3);

    }

    /*
    练习2：将字符串“2023-08-23”转换为java.sql.Date

    字符串 --> java.util.Date --> java.sql.Date
     */
    @Test
    public void test2() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String pattern = "2023-08-23";

        Date date1 = sdf.parse(pattern);

        java.sql.Date date2 = new java.sql.Date(date1.getTime());
        System.out.println(date2);
    }

}
