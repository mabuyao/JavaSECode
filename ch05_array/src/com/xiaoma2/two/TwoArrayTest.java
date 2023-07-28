package com.xiaoma2.two;

/**
 * ClassName: TwoArrayTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/28 14:54
 * @Version 1.0
 */
public class TwoArrayTest {
    public static void main(String[] args) {
        //数组的声明与初始化
        int[] arr1 = new int[]{1, 2, 3};

        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        //动态初始化
        String[][] arr3 = new String[3][4];

        double[][] arr4 = new double[2][];

        //其他正确的写法
        int arr5[][] = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int[] arr6[] = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int arr7[][] = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};//类型推断
        String arr8[][] = new String[3][4];

        //数组元素的调用
        //调用内层元素
        System.out.println(arr2[0][0]);//1
        System.out.println(arr2[2][1]);//7

        //调用外层元素
        System.out.println(arr2[0]);//[I@4eec7777  打印了一个地址

        //测试arr3,arr4
        arr3[0][1] = "Tom";
        System.out.println(arr3[0][1]);
        System.out.println(arr3[0]);//[Ljava.lang.String;@3b07d329

        arr4[0] = new double[4];
        arr4[0][0] = 1.0;

        //数组的长度
        System.out.println(arr2.length);//3
        System.out.println(arr2[0].length);//3
        System.out.println(arr2[1].length);//2
        System.out.println(arr2[2].length);//4

        //如何遍历数组
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
