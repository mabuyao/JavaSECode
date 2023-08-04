package com.xiaoma03._extends;

/**
 * ClassName: Student
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/4 10:31
 * @Version 1.0
 */
public class Student extends Person {
    String school;

    public void study() {
        System.out.println("study");
    }

    public void show1() {
        System.out.println("age = " + this.getAge());
    }
}
