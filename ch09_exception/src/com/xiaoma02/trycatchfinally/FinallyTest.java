package com.xiaoma02.trycatchfinally;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: FinallyTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/17 16:44
 * @Version 1.0
 */
public class FinallyTest {
    @Test
    public void test1(){
        try {
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(10 / 0);//在catch中出现异常，程序终止
        }
        System.out.println("异常处理结束，代码继续执行");
    }

    @Test
    public void test2(){
        try {
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            System.out.println(10 / 0);//在catch中出现异常，finally仍然会执行
        }finally {
            System.out.println("程序结束");
        }

    }

    @Test
    public void test3(){
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
        }finally {
//            fis.close();//fis未声明，无法关闭
            System.out.println("文件关闭");
        }
    }
}
