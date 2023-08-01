package com.xiaoma04.example.exer4;

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
        MyArreys arrs = new MyArreys();
        int[] arr = new int[]{34,5,6,254,225,346,36,32,234,65,34,62,42,5};
        System.out.println("最大值为：" + arrs.getMax(arr));
        System.out.println("平均值为：" + arrs.getAvg(arr));
        arrs.print(arr);

        int index = arrs.linearSearch(arr, 42);
        if(index >= 0){
            System.out.println("找到啦，位置为：" + index);
        }else{
            System.out.println("未找到");
        }

        arrs.sort(arr);
        arrs.print(arr);
    }
}
