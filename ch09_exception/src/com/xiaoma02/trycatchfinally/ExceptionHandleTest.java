package com.xiaoma02.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ClassName: ExceptionHandleTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/17 16:06
 * @Version 1.0
 */
public class ExceptionHandleTest {
    @Test
    public void test1() {
        try {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
        System.out.println("异常处理结束，代码继续执行");
    }

    @Test
    public void test2() {
        try {
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NumberFormatException e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("异常处理结束，代码继续执行");
    }


    //*************下面来处理编译时异常*****************
    @Test
    public void test3() {
        try {
            File file = new File("hello.txt");
            FileInputStream fis = new FileInputStream("hello.txt");
            int data = fis.read();
            while (data != -1) {
                System.out.println((char) data);
                data = fis.read();
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("异常处理结束，代码继续执行");
    }
}
