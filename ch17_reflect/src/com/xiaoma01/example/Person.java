package com.xiaoma01.example;

/**
 * ClassName: Person
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/6 10:52
 * @Version 1.0
 */
public class Person {
    //属性
    private String name;
    public int age;

    //构造器
    public Person(){
        System.out.println("Person()...");
    }

    public Person(int age){
        this.age = age;
    }

    private Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    //方法
    public void show(){
        System.out.println("你好，我是一个Person");
    }

    private String showNation(String nation){
        return "我的国籍是：" + nation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


