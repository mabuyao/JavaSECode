package com.xiaoma04.example.exer5_objarr;

/**
 * ClassName: Student
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 16:23
 * @Version 1.0
 */
public class Student {
    int number;//学号
    int state;//年级
    int score;//成绩

    //声明方法显示学生属性信息
    public String show(){
        return "number: " + number + ", state: " + state + ", score: " + score;
    }
}
