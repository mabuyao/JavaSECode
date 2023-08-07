package com.xiaoma05._super;

/**
 * ClassName: StudentTets
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/7 15:45
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.eat();
        s1.sleep();
        s1.show();
        s1.show2();

        System.out.println("****************************************");

        Student s2 = new Student();

        System.out.println("****************************************");

        Student s3 = new Student("Tom", 12);

    }
}
