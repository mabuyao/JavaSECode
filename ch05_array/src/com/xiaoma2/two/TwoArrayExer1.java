package com.xiaoma2.two;

/**
 * ClassName: TwoArrayExer1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/28 17:26
 * @Version 1.0
 */
public class TwoArrayExer1 {
    public static void main(String[] args) {
        //初始化数组（静态初始化）
        int[][] arr = new int[][]{{3, 5, 8}, {12, 9}, {7, 0, 6, 4}};

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }

        System.out.println("总和为：" + sum);
    }
}
