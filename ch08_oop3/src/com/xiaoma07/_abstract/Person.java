package com.xiaoma07._abstract;

/**
 * ClassName: Person
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 11:02
 * @Version 1.0
 */
public abstract class Person extends Creature{//抽象类，不能够实例化
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public abstract void eat();//抽象方法没有方法体
    public void sleep(){
        System.out.println("person sleep");
    }
}
