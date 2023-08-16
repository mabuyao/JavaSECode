package com.xiaoma07._abstract;

/**
 * ClassName: Student
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 11:03
 * @Version 1.0
 */
public class Student extends Person{
    String school;

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }
    public void eat(){
        System.out.println("student eat");
    }
    public void sleep(){
        System.out.println("student sleep");
    }

    @Override
    public void breath() {
        System.out.println("student breath");
    }
}
