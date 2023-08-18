package com.xiaoma01.throwable;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName: ExceptionTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/17 15:21
 * @Version 1.0
 */
public class ExceptionTest {
    /*
    * ArrayIndexOutOfBoundsException: 数组下标越界异常
     */
    @Test
    public void test1(){
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    /*
    * NullPointerException: 空指针异常
     */
    @Test
    public void test2(){
//        String str = "abc";
//        str = null;
//        System.out.println(str.toString());

//        int[] arr = null;
//        System.out.println(arr[0]);

        int[][] arr = new int[4][];
        System.out.println(arr[0][0]);
    }

    /*
    * ClassCastException: 类型转换异常
     */
    @Test
    public void test3(){
        Object obj = new String();
//        String str = (String) obj;

        Date date = (Date) obj;
    }

    /*
    * NumberFormatException: 数字格式化异常
     */
    @Test
    public void test4(){
        String str = "123";
        str = "abc";
        int i = Integer.parseInt(str);
        System.out.println(i);
    }

    /*
    * InputMismatchException: 输入不匹配异常
     */
    @Test
    public void test5(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(num);
    }

    /*
    * ArithmeticException: 算术异常
     */
    @Test
    public void test6(){
        int num = 10;
        System.out.println(num / 0);
    }

    //***********以上是运行时异常***********
    //***********以下是编译时异常***********

    /*
    * ClassNotFoundException: 类未找到异常
     */
    @Test
    public void test7() throws ClassNotFoundException {
        Class clazz = Class.forName("com.xiaoma01.throwable.User");
    }

    /*
    * FileNotFoundException: 文件未找到异常
    * IOException: 输入输出异常
     */
    @Test
    public void test8() throws FileNotFoundException, IOException {
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream("hello.txt");//FileNotFoundException
        int data = fis.read();//IOException
        while (data != -1){
            System.out.println((char) data);
            data = fis.read();//IOException
        }
        fis.close();//IOException
    }
}
