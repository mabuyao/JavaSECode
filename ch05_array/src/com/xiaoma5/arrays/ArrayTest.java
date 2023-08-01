package com.xiaoma5.arrays;

import java.util.Arrays;

/**
 * ClassName: ArrayTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/31 16:39
 * @Version 1.0
 */
public class ArrayTest {
    public static void main(String[] args) {
        //1. boolean equals(int[] a,int[] b)：比较两个数组的元素是否依次相等
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{1,2,3,4,5};

        System.out.println(arr1 == arr2);//false

        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println(isEquals);//true

        //2. String toString(int[] a):输出数组元素信息。
        System.out.println(arr1);//[I@4eec7777

        System.out.println(Arrays.toString(arr1));

        //3.void fill(int[] a,int val):将指定值填充到数组之中。
        Arrays.fill(arr1, 10);

        System.out.println(Arrays.toString(arr1));

        //4. void sort(int[] a):使用快速排序算法实现的排序
        int[] arr3 = new int[]{34,54,3,2,65,7,34,5,76,34,67};
        Arrays.sort(arr3);

        System.out.println(Arrays.toString(arr3));

        //5. int binarySearch(int[] a,int key):二分查找
        //使用前提：当前数组必须是有序的
        int index = Arrays.binarySearch(arr3, 15);
        if(index >= 0){
            System.out.println("找到了，索引位置为：" + index);
        }else {
            System.out.println("未找到");
        }
    }
}
