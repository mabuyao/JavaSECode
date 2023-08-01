package com.xiaoma01.oop;

/**
 * ClassName: Phone
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 9:53
 * @Version 1.0
 */
public class Phone {
    //属性
    String name;//品牌
    double price;//价格

    //方法
    public void call(){
        System.out.println("手机能够拨打电话");
    }

    public void sendMessage(String message){
        System.out.println("发送信息" + message);
    }

    public void playGame(){
        System.out.println("手机可以玩游戏");
    }
}
