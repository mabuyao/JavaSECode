package com.xiaoma01._static.exer2;

/**
 * ClassName: MyArraysTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 15:41
 * @Version 1.0
 */
public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34,5,6,254,225,346,36,32,234,65,34,62,42,5};
        System.out.println("最大值为：" + MyArreys.getMax(arr));
        System.out.println("平均值为：" + MyArreys.getAvg(arr));
        MyArreys.print(arr);

        int index = MyArreys.linearSearch(arr, 42);
        if(index >= 0){
            System.out.println("找到啦，位置为：" + index);
        }else{
            System.out.println("未找到");
        }

        MyArreys.sort(arr);
        MyArreys.print(arr);
    }
}
