package com.xiaoma06.polymorphism;

/**
 * ClassName: Man
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 9:34
 * @Version 1.0
 */
public class Man extends Person{
    boolean isSmoking;
    int id = 1002;

    public void eat(){
        System.out.println("man eat");
    }

    public void walk(){
        System.out.println("man walk");
    }

    public void earnMoney(){
        System.out.println("man earnMoney");
    }
}
