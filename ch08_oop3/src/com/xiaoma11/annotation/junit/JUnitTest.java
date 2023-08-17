package com.xiaoma11.annotation.junit;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName: JUnitTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/16 16:47
 * @Version 1.0
 */
public class JUnitTest {//单元测试类
    @Test
    public void test1() {//单元测试方法
        System.out.println("hello");
    }

    @Test
    public void test2() {
        System.out.println("world");
    }

    @Test
    public void test3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int num = scanner.nextInt();
        System.out.println("num = " + num);
    }

    @Test
    public void test5(){
        System.out.println("test5");
    }

}
