package com.xiaoma1.one;

/**
 * ClassName: OneArrayTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/28 10:56
 * @Version 1.0
 */
public class OneArrayTest {
    public static void main(String[] args) {
        // 数组的声明与初始化
        int num1 = 10;
        int num2;// 声明
        num2 = 20;// 初始化

        // 声明数组
        double[] prices;
        // 初始化数组
        prices = new double[]{20.32, 43.21, 43.22};// 静态初始化:变量与元素同时赋值

        String[] foods;
        foods = new String[]{"拌海蜇", "龙须菜", "炝冬笋", "玉兰片"};

        String[] food = new String[4];// 动态初始化

        // 其他正确的方式
        int arr[] = new int[4];
        int[] arr1 = {1, 2, 3, 4};// 类型推断

        // 错误的方式
        // int[] arr2 = new int[3]{1, 2, 3}; // 动静结合


        // 数组元素的调用
        // 通过角标的方式获取数组的元素
        System.out.println(prices[0]);
        System.out.println(prices[2]);
        // System.out.println(prices[3]); // 报异常：ArrayIndexOutOfBoundsException

        food[0] = "拌海蜇";
        food[1] = "龙须菜";

        //数组的长度
        System.out.println(foods.length);
        System.out.println(prices.length);

        //如何遍历数组
        for(int i = 0; i < 4; i++){
            System.out.println(foods[i]);
        }

        for (int i = 0; i < prices.length; i++) {
            System.out.println(prices[i]);
        }
    }
}
