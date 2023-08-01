package com.xiaoma02.memory;

/**
 * ClassName: Person
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 10:09
 * @Version 1.0
 */
public class Person {
    //属性
    String name;
    int age;
    char gender;

    //方法
    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(int hour){
        System.out.println("人至少保证每天有" + hour + "小时的睡眠");
    }

    public void interests(String hobby){
        System.out.println("我的爱好是：" + hobby);
    }
}
