package com.xiaoma4.search_sort;

/**
 * ClassName: BubbleSortTest
 * Description:
 * 冒泡排序
 * @Author Mabuyao
 * @Create 2023/7/31 16:09
 * @Version 1.0
 */
public class BubbleSortTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};

        //遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        //冒泡排序,实现数组元素从大到小排列

        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if(arr[i] > arr[i + 1]){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
