package com.xiaoma14.review;

/**
 * ClassName: StaticTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/17 14:35
 * @Version 1.0
 */
public class StaticTest {
    public static void main(String[] args) {
        Person p1 = new Student();
        p1.eat();

        Person p2 = null;
        p2.eat();
    }
}


class Person{
    public static void eat(){
        System.out.println("人吃饭");
    }

    public static void walk(){
        System.out.println("人走路");
    }


}

class Student extends Person{
    public static void eat(){
        System.out.println("学生吃饭");
    }
}