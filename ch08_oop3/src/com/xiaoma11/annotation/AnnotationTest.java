package com.xiaoma11.annotation;

import java.util.Date;

/**
 * ClassName: AnnotationTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/16 15:16
 * @Version 1.0
 */
public class AnnotationTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.eat();
        student.walk();

        Date date = new Date();
        System.out.println(date);

        Date date1 = new Date(2023, 8, 16);
        System.out.println(date1);

        @SuppressWarnings("RedundantExplicitVariableType") Person p3 = new Person("Tom");
        System.out.println(p3);

        @SuppressWarnings("unused") int num = 10;
    }
}

@MyAnnotation(value = "class")
class Person {
    String name;
    int age;

    @MyAnnotation()
    public Person() {
    }

    @Deprecated
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void eat() {
        System.out.println("人吃饭");
    }

    public void walk() {
        System.out.println("人走路");
    }
}

class Student extends Person {
    @Override
    public void eat() {
        System.out.println("学生吃饭");
    }

    @Override
    public void walk() {
        System.out.println("学生走路");
    }
}