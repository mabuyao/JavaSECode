package com.xiaoma05._super;

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

    int id = 1002;//学号

    public Student() {
        super();
        //this("Tom",12);
        //调用构造器必须放在首行且只能调用1个（多个也只能有一个在首行）
        System.out.println("Student()...");
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void study() {
        System.out.println("study");
    }

    public void eat() {
        System.out.println("student eat");
    }

    public void sleep() {
        System.out.println("student sleep");
    }

    public void show() {
        eat();
        this.eat();

        super.eat();
    }

    public void show1() {
        doSport();//本类中没有写前缀的话都是省略了this
        this.doSport();
    }

    public void show2() {
        System.out.println(id);//1002
        System.out.println(this.id);//1002
        System.out.println(super.id);//1001
    }

    public void show3() {
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
