package com.xiaoma06.polymorphism;

/**
 * ClassName: Woman
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 9:36
 * @Version 1.0
 */
public class Woman extends Person{
    boolean isBeauty;

    public void eat(){
        System.out.println("woman eat");
    }

    public void walk(){
        System.out.println("woman walk");
    }

    public void goShopping(){
        System.out.println("woman goShopping");
    }
}
