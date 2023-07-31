package com.xiaoma3.common_algorithm;

/**
 * ClassName: ArrayExer3
 * Description:
 * 杨辉三角
 * @Author Mabuyao
 * @Create 2023/7/31 9:54
 * @Version 1.0
 */
public class ArrayExer3 {
    public static void main(String[] args) {
        //1.创建二维数组
        int[][] yangHui = new int[10][];

        //2.使用循环结构，初始化外层数组元素
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];
            //3.给数组元素赋值
            //3.1 给数组每行的首末元素赋值为1
            yangHui[i][0] = yangHui[i][i] = 1;

            //3.2 给数组的每行非首末元素赋值
            //if(i >= 2){
                for (int j = 1; j < yangHui[i].length - 1; j++) {
                    //j从每行第二个元素开始到倒数第二个元素结束
                    yangHui[i][j] = yangHui[i - 1][j] + yangHui[i - 1][j - 1];
                }
            //}
        }

        //遍历二维数组
        for (int i = 0; i < yangHui.length; i++) {
            for (int j = 0; j < yangHui[i].length; j++) {
                System.out.print(yangHui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
