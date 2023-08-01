package com.xiaoma04.example.exer5_objarr1;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 16:24
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        //创建Student[]
        Student[] students = new Student[20];

        //使用循环，给数组元素赋值
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            //给每一个学生对象的属性赋值
            students[i].number = i + 1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
        }

        //需求1：打印出三年级的学生信息
        StudentUtil util = new StudentUtil();
        util.printStudentsWithIndex(students, 3);

        //需求2：使用冒泡排序按学生成绩排序，并遍历所有学生信息
        util.printStudents(students);

        System.out.println("*********************************************");
        util.sortStudents(students);

        util.printStudents(students);
    }
}
