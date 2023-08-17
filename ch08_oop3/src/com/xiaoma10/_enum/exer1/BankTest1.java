package com.xiaoma10._enum.exer1;

/**
 * ClassName: BankTest1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/16 14:32
 * @Version 1.0
 */
public class BankTest1 {
    public static void main(String[] args) {
        System.out.println(GirlFriend.XIAO_LI);
    }
}

//jdk5.0之前的使用枚举类定义单例模式
class Bank1{
    private Bank1(){}

    public static final Bank1 instance = new Bank1();
}

//jdk5.0中使用enum关键字定义单例模式
enum Bank2{
    CPB;
}

enum GirlFriend{
    XIAO_LI(20);
    private final int age;

    GirlFriend(int age) {
        this.age = age;
    }
}