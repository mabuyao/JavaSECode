package com.xiaoma04.block;

/**
 * ClassName: BlockTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/11 16:35
 * @Version 1.0
 */
public class BlockTest {
    public static void main(String[] args) {
        System.out.println(Person.info);
        System.out.println(Person.info);

        Person p1 = new Person();
        System.out.println(p1.age);
        Person p2 = new Person();

        p1.eat();
    }
}

class Person{
    String name;
    int age;
    static String info = "我是一个人";
    public Person(){

    }

    public void eat(){
        System.out.println("eat");
    }

    //非静态代码块
    {
        System.out.println("非静态代码块1");
        age = 1;
    }
    {
        System.out.println("非静态代码块2");
    }

    //静态代码块
    static{
        System.out.println("静态代码块1");
        System.out.println("info = " + info);
    }
    static {
        System.out.println("静态代码块1");
    }
}