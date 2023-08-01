package com.xiaoma03.field_method.field;

/**
 * ClassName: FieldTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 10:48
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Person p1 = new Person();

        System.out.println(p1.name + " " + p1.age);

        p1.sleep(8);
    }
}

class Person{
    //属性（或成员变量）
    String name;
    int age;
    char gender;

    //方法
    public void eat(){
        String food = "宫保鸡丁";//局部变量
        System.out.println("我喜欢吃" + food);
    }

    public void sleep(int hour){//形参，属于局部变量
        System.out.println("人不能少于" + hour + "小时睡眠");
    }
}
