package com.xiaoma04.override;

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

    public void eat() {
        System.out.println("student eat more");
    }

    public void show1() {
        System.out.println("age = " + this.getAge());
    }

    public Student info(){
        return null;
    }

    public void sleep(){
        System.out.println("student sleep more");
    }
}
