package com.xiaoma03.field_method.method;

/**
 * ClassName: MethodTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 13:55
 * @Version 1.0
 */
public class MethodTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();
    }
}

class Person{
    //属性
    String name;
    int age;
    char gender;

    //方法
    /*
    权限修饰符 [其他关键字] 返回值类型 方法名(形参列表){//方法头
        //方法体
    }
     */
    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(int hour){
        System.out.println("人至少每天睡眠" + hour + "小时");
    }

    public String interests(String hobby){
        String info = "我的爱好是" + hobby;
        System.out.println(info);
        return info;
    }

    public int getAge(){
        return age;
    }

    public void printNumber(int targetNumber){
        for (int i = 1; i <= targetNumber; i++) {
            if(i == 4){
                return;//用于结束方法
            }

            System.out.println(i);
        }
    }
}