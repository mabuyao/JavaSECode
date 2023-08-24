package com.xiaoma01.string;

import org.junit.jupiter.api.Test;

/**
 * ClassName: StringDemo
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/23 9:19
 * @Version 1.0
 */
public class StringDemo {
    @Test
    public void test1(){
        String str1 = "hello";  // 字面量的定义方式
        String str2 = "hello";

        System.out.println(str1 == str2);  // true
    }

    /**
     * String的不可变性
     * ① 当对字符串重新赋值时，需要重新指定内存区域赋值，不能使用原有的value进行赋值
     * ② 当对现有的字符串进行连接操作时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值
     * ③ 当调用String的replace()方法修改指定字符或字符串时，也需要重新指定内存区域赋值，不能使用原有的value进行赋值
     */
    @Test
    public void test2(){
        String str1 = "hello";  // 字面量的定义方式
        String str2 = "hello";

        str2 = "hi";

        System.out.println(str1);
    }

    @Test
    public void test3(){
        String str1 = "hello";  // 字面量的定义方式
        String str2 = "hello";

        str2 += "world";

        System.out.println(str1);
        System.out.println(str2);

    }

    @Test
    public void test4(){
        String str1 = "hello";  // 字面量的定义方式
        String str2 = "hello";

        String str3 =  str2.replace('l','w');

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

    }
}
