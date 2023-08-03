package com.xiaoma08.constructor;

/**
 * ClassName: Person
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 10:13
 * @Version 1.0
 */
public class Person {
    String name;
    int age;

    //构造器
    public Person(){
        System.out.println("Person()....");
    }
    public Person(int a){
        age = a;
    }

    public void eat(){
        System.out.println("eat");
    }

    public void sleep(){
        System.out.println("sleep");
    }
}
