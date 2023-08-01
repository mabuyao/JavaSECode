package com.xiaoma6.exception;

/**
 * ClassName: ArrayExceptionTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/31 16:56
 * @Version 1.0
 */
public class ArrayExceptionTest {
    public static void main(String[] args) {
        //1.数组角标越界的异常
        int[] arr = new int[10];

        //System.out.println(arr[10]);//ArrayIndexOutOfBoundsException
        //System.out.println(arr[-1]);//ArrayIndexOutOfBoundsException

        //2.空指针异常
        /*
        int[] arr1 = new int[10];
        arr1 = null;
        System.out.println(arr1[0]);//NullPointerException
         */

        int[][] arr2 = new int[3][];
        //System.out.println(arr2[0][1]);//NullPointerException

        String[] arr3 = new String[4];
        //System.out.println(arr3[0].toString());//NullPointerException
    }
}
