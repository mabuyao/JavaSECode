package com.xiaoma01.throwable;

/**
 * ClassName: ErrorTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/17 15:12
 * @Version 1.0
 */
public class ErrorTest {
    public static void main(String[] args) {
        // 1.栈溢出: java.lang.StackOverflowError
        // main(args);

        // 2.堆溢出: java.lang.OutOfMemoryError: Java heap space
        Integer[] arr = new Integer[1024 * 1024 * 1024];
    }
}
