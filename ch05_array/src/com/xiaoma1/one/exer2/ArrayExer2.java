package com.xiaoma1.one.exer2;

import java.util.Scanner;

/**
 * ClassName: ArrayExer2
 * Description:
 * 输出英文星期几
 *
 * 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应的单词
 * {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 * @Author Mabuyao
 * @Create 2023/7/28 14:30
 * @Version 1.0
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        //定义包含7个单词的数组
        String[] weeks = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner scan = new Scanner(System.in);
        System.out.println("请输入数值（1-7）：");
        int day = scan.nextInt();

        if(day < 1 || day > 7){
            System.out.println("你输入的数据有误。");
        }else{
            System.out.println(weeks[day - 1]);
        }

        scan.close();
    }
}
