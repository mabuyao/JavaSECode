package com.xiaoma2.two;

/**
 * ClassName: TwoArrayTest1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/28 15:32
 * @Version 1.0
 */
public class TwoArrayTest1 {
    public static void main(String[] args) {
        //数组元素的默认初始化值
        /*
        动态初始化方式1：(比如：int[][] arr = new int[3][4])
            1）外层元素，默认存储地址值。
            2）内层元素，默认与一维数组元素的不同类型的默认值规定相同。
                > 整型数组元素的默认初始化值：0
                > 浮点型数组元素的默认初始化值：0.0
                > 字符型数组元素的默认初始化值：0 (或理解为'\u0000')
                > boolean型数组元素的默认初始化值：false
                > 引用数据类型数组元素的默认初始化值：null
        动态初始化方式2：(比如：int[][] arr = new int[3][])
            1）外层元素，默认存储null
            2）内层元素，不存在的。如果调用会报错（NullPointerException）
         */
        int[][] arr1 = new int[3][2];
        System.out.println(arr1[0]);//[I@4eec7777
        System.out.println(arr1[1]);//[I@3b07d329

        System.out.println(arr1[0][0]);//0

        boolean[][] arr2 = new boolean[3][4];
        System.out.println(arr2[0]);//[Z@41629346
        System.out.println(arr2[0][1]);//false

        String[][] arr3 = new String[4][2];
        System.out.println(arr3[0]);//[Ljava.lang.String;@404b9385
        System.out.println(arr3[0][1]);//null

        int[][] arr4 = new int[4][];
        System.out.println(arr4[0]);//null
        //System.out.println(arr4[0][0]);//NullPointerException 报错

        String[][] arr5 = new String[5][];
        System.out.println(arr5[0]);//null
        //System.out.println(arr5[0][0]);//NullPointerException 报错
    }
}
