package com.xiaoma04.override;

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

    public void eat() {
        System.out.println("eat");
    }

    public void sleep() {
        System.out.println("sleep");
    }

    public void show() {
        System.out.println("age = " + age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person info(){
        return null;
    }
}
