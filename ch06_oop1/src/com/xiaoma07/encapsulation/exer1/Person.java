package com.xiaoma07.encapsulation.exer1;

/**
 * ClassName: Person
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/2 17:13
 * @Version 1.0
 */
public class Person {
    private int age;

    public void setAge(int a){
        if(a >= 0 && a <= 130){
            age = a;
        }else{
            System.out.println("你输入的数据非法");
        }
    }

    public int getAge(){
        return age;
    }

    public int doAge(int a){
        if(a >= 0 && a <= 130){
            age = a;
            return a;
        }else{
            System.out.println("你输入的数据非法");
            return -1;
        }
    }
}
