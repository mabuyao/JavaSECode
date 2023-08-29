package com.xiaoma03.list.exer1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/28 15:41
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List list = new ArrayList();

        System.out.println("请录入学生信息");

        //通过循环的方式，添加多个学生信息
        while (true){
            System.out.println("1:继续录入，0：结束录入");
            int selection = scan.nextInt();

            if(0 == selection){
                break;
            }

            System.out.print("请输入学生的姓名：");
            String name = scan.next();
            System.out.print("请输入学生的年龄：");
            int age = scan.nextInt();

            Student s = new Student(name, age);

            list.add(s);
        }

        //遍历学生信息
        System.out.println("遍历学生信息：");
        for(Object s : list){
            System.out.println(s.toString());
        }

        scan.close();
    }
}
