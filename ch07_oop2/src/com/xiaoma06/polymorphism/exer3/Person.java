package com.xiaoma06.polymorphism.exer3;

/**
 * ClassName: Person
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 14:13
 * @Version 1.0
 */
public class Person {
    protected String name = "person";
    protected int age = 50;

    public String getInfo() {
        return "Name: " + name + "\n" + "age: " + age;
    }
}
