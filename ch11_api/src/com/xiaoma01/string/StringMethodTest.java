package com.xiaoma01.string;

import org.junit.jupiter.api.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: StringMethodTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/23 10:26
 * @Version 1.0
 */
public class StringMethodTest {
    @Test
    public void test1(){
        String s1 = new String();
        String s2 = new String("");

        String s3 = new String(new char[]{'a','b','c'});
        System.out.println(s3);

    }

    /**
     * String与常见的其他结构之间的转换
     *
     * 1. String 与基本数据类型、包装类之间的转换
     *
     * 2. String 与 char[] 之间的转换
     *
     * 3. String 与 byte[] 之间的转换
     */

    @Test
    public void test2(){
        int num = 10;
        //基本数据类型、包装类--->String类型
        //方式1：连接运算
        String s1 = num + "";
        //方式2：调用String的valueOf(Xxx xxx)
        String s2 = String.valueOf(num);

        //String类型--->基本数据类型、包装类
        String s3 = "123";
        //方式1：调用包装类的parseXxx(String s)
        int i1 = Integer.parseInt(s3);

    }

    //String 与 char[] 之间的转换
    @Test
    public void test3(){
        String str = "hello";

        //String --> char[]:调用String的toCharArray()
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        //char[] --> String:调用String的构造器
        String str1 = new String(chars);
        System.out.println(str1);
    }

    //String 与 byte[] 之间的转换

    /**
     * 在UTF-8编码中，一个汉字占用3个字节，而一个英文字母占用1个字节
     * 在GBK编码中，一个汉字占用2个字节，而一个英文字母占用1个字节
     *
     * UTF-8或GBK编码中，都兼容ASCII码
     *
     * 编码与解码
     * 编码：字符串 --> 字节 (看得懂 --> 看不懂的二进制数据)
     * 解码：编码的逆过程，字节  --> 字符串 (看不懂的二进制数据 --> 看得懂)
     * 要求：编码集要一致，否则会出现乱码
     */
    @Test
    public void test4() throws UnsupportedEncodingException {
        String str = new String("hello中国");

        //String --> byte[]:调用String的getBytes()
        byte[] bytes = str.getBytes();//使用默认的字符集，进行转换
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }
        System.out.println("*************");

        //getBytes(String charsetName):使用指定的字符集，进行转换
        byte[] gbks = str.getBytes("gbk");//使用gbk字符集，进行转换
        for (int i = 0; i < gbks.length; i++) {
            System.out.println(gbks[i]);
        }

        //byte[] --> String:调用String的构造器
        String str1 = new String(bytes);//使用默认的字符集，进行转换
        System.out.println(str1);

        String str2 = new String(bytes,"utf-8");//使用utf-8字符集，进行转换
        System.out.println(str2);

        String str3 = new String(bytes,"gbk");//使用gbk字符集，进行转换
        System.out.println(str3);

        String str4 = new String(gbks,"gbk");//使用gbk字符集，进行转换
        System.out.println(str4);
    }
}
