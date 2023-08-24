package com.xiaoma03.date.before8;

import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * ClassName: DateTimeTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/23 16:33
 * @Version 1.0
 */
public class DateTimeTest {
    /*
    Date类的使用
    java.util.Date类
        1.两个构造器的使用
            >构造器一：Date()：创建一个对应当前时间的Date对象
            >构造器二：创建指定毫秒数的Date对象
        2.两个方法的使用
            >toString()：显示当前的年、月、日、时、分、秒
            >getTime()：获取当前Date对象对应的毫秒数。（时间戳）
            |---java.sql.Date类：对应数据库中的date类型的变量
     */
    @Test
    public void test1() {
        Date date1 = new Date();//创建一个对应当前时间的Date对象
        System.out.println(date1.toString());//Wed Aug 23 16:35:29 CST 2023

        System.out.println(date1.getTime());//1692779729725

        Date date2 = new Date(1692779729725L);//创建指定毫秒数的Date对象
        System.out.println(date2.toString());//Wed Aug 23 16:35:29 CST 2023
    }

    @Test
    public void test2() {
        java.sql.Date date1 = new java.sql.Date(1692779729725L);
        System.out.println(date1.toString());//2023-08-23

        System.out.println(date1.getTime());//1692779729725
    }


    /*
    SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析
    1.两个操作：
        1.1格式化：日期-->字符串
        1.2解析：格式化的逆过程，字符串-->日期
     */

    @Test
    public void test3() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        //格式化：日期-->字符串
        Date date1 = new Date();
        String strDate = sdf.format(date1);
        System.out.println(strDate);//23-8-23 下午4:43

        //解析：格式化的逆过程，字符串-->日期
        Date date2 = sdf.parse("23-8-23 下午4:43");
        System.out.println(date2);//Wed Aug 23 16:43:00 CST 2023

    }

    @Test
    public void test4() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //格式化:日期-->字符串
        Date date1 = new Date();
        String strDate = sdf.format(date1);
        System.out.println(strDate);//星期三, 23 八月 2023 16:46:49 +0800 ---> 2023-08-23 04:49:04

        //解析：格式化的逆过程，字符串-->日期
        Date date2 = sdf.parse("2023-08-23 04:49:04");
        System.out.println(date2);//Wed Aug 23 04:49:04 CST 2023
    }

    /*
    Calendar日历类(抽象类)的使用
    ① Calendar类的实例化 由于Calendar为抽象类，不能直接创建对象，需要调用其静态方法getInstance()
    ② 常用方法
        get()
        set()
        add()
        getTime()
        setTime()


     */

    @Test
    public void test5(){
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getClass());//class java.util.GregorianCalendar

        //测试方法
        //get()
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//23
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));//235

        //set()
        calendar.set(Calendar.DAY_OF_MONTH,22);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//22

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,3);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//25
        calendar.add(Calendar.DAY_OF_MONTH,-2);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//23

        //getTime():日历类-->Date
        Date date = calendar.getTime();
        System.out.println(date);//Wed Aug 23 17:04:37 CST 2023

        //setTime():Date-->日历类
        Date date1 = new Date();
        calendar.setTime(date1);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//23
    }
}
