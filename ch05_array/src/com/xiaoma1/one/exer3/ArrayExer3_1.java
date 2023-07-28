package com.xiaoma1.one.exer3;

import java.util.Scanner;

/**
 * ClassName: ArrayExer3_1
 * Description:
 * 从键盘读入学生成绩，找出最高分，并输出学生成绩等级。
 * 成绩>=最高分-10  等级为’A’
 * 成绩>=最高分-20  等级为’B’
 * 成绩>=最高分-30  等级为’C’
 * 其余            等级为’D’
 * 提示：先读入学生人数，根据人数创建
 * @Author Mabuyao
 * @Create 2023/7/28 14:36
 * @Version 1.0
 */
public class ArrayExer3_1 {
    public static void main(String[] args) {
        //从键盘输入人数，根据人数创建数组
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int count = scan.nextInt();

        int[] scores = new int[count];

        //根据提示依次输入学生的成绩，并将成绩保存在数组元素中
        int maxScore = scores[0];
        System.out.println("请输入" + count + "个成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = scan.nextInt();

            //获取学生成绩的最大值
            if(maxScore < scores[i]){
                maxScore = scores[i];
            }
        }

        System.out.println("最高分是：" + maxScore);

        //遍历数组元素，根据学生成绩与最高分的差值，得到每个学生的等级，并输出成绩和等级
        char grade = 0;
        for (int i = 0; i < scores.length; i++) {
            if(scores[i] >= maxScore - 10){
                grade = 'A';
            }else if(scores[i] >= maxScore - 20){
                grade = 'B';
            }else if(scores[i] >= maxScore - 30){
                grade = 'C';
            }else{
                grade = 'D';
            }
            System.out.println("student " + i + " score is " + scores[i] + " grade is " + grade);
        }

        scan.close();
    }
}
