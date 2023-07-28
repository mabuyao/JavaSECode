package com.xiaoma2.two;

/**
 * ClassName: TwoArrayExer2
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/28 17:31
 * @Version 1.0
 */
public class TwoArrayExer2 {
    public static void main(String[] args) {
        // = 赋值符号
        int i = 10;
        int j = i;
        byte b = (byte) i;//强制类型转换

        long l = i;//自动类型提升

        //举例：数组
        int[] arr1 = new int[10];
        byte[] arr2 = new byte[20];
        //arr1 = arr2; //编译不通过

        System.out.println(arr1);//[I@4eec7777
        System.out.println(arr2);//[B@3b07d329

        int[][] arr3 = new int[3][2];

        //arr3 = arr1; //编译不通过

        arr3[0] = arr1;
        System.out.println(arr3[0]);//[I@4eec7777
        System.out.println(arr1);//[I@4eec7777

        System.out.println(arr3);//[[I@7699a589

        /*
        声明：int[] x,y[]; 在给x,y变量赋值以后，以下选项允许通过编译的是：
        a)    x[0] = y;                 //no
        b)    y[0] = x;                 //yes
        c)    y[0][0] = x;              //no
        d)    x[0][0] = y;              //no
        e)    y[0][0] = x[0];           //yes
        f)    x = y;                    //no

        提示：
        一维数组：int[] x  或者int x[]
        二维数组：int[][] y 或者  int[] y[]  或者 int  y[][]
         */
    }
}
