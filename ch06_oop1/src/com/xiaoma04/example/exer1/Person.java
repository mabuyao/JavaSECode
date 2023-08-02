package com.xiaoma04.example.exer1;

/**
 * ClassName: Person
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 15:07
 * @Version 1.0
 */
public class Person {
    //属性
    String name;
    public int age;
    char gender;

    //方法
    public void study(){
        System.out.println("studying");
    }

    public int showAge(){
        return age;
    }

    public void addAge(int addAge){
        age += addAge;
    }
}
