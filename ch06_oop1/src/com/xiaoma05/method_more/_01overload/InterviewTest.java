package com.xiaoma05.method_more._01overload;

/**
 * ClassName: InterviewTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/2 9:22
 * @Version 1.0
 */
public class InterviewTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(arr);//地址值[I@41629346

        char[] arr1 = new char[]{'a','b','c','d','e'};
        System.out.println(arr1);//abcde

        boolean[] arr2 = new boolean[]{false,true,true};
        System.out.println(arr2);//地址值[Z@404b9385
    }
}
