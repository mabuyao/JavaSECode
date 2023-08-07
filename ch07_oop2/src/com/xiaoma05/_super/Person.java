package com.xiaoma05._super;

/**
 * ClassName: Person
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/4 10:30
 * @Version 1.0
 */
public class Person {
    String name;
    private int age;

    int id = 1001;//身份证号

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        System.out.println("Person()...");
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
    }

    public void doSport() {
        System.out.println("sport");
    }
}
