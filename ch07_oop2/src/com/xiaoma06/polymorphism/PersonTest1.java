package com.xiaoma06.polymorphism;

/**
 * ClassName: PersonTest1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 11:07
 * @Version 1.0
 */
public class PersonTest1 {
    public static void main(String[] args) {
        Person p1 = new Man();

        //不能调用子类特有的方法
//        p1.earnMoney();
//        System.out.println(p1.isSmoking);

        //向下转型:使用强制类型转换符
        Man m1 = (Man) p1;
        m1.earnMoney();
        System.out.println(m1.isSmoking);

        System.out.println(p1 == m1);//true，p1和m1指向堆空间中的同一个对象

        /*
        向下转型可能会出现:ClassCastException 类型转换异常
         */
        Person p2 = new Woman();
//        Man m2 = (Man) p2;
//        m2.earnMoney();

        /*
        1.建议在向下转型之前，使用instanceof判断是否可以转换
        2.格式：a instanceof A
            如果a是A类的实例，返回true，否则返回false
        3.如果a instanceof A返回true，则：
            a instanceof superA也返回true，其中A是superA的子类
            a instanceof Object也返回true
         */
        if(p2 instanceof Man){
            Man m2 = (Man) p2;
            m2.earnMoney();
        }

        if(p2 instanceof Woman){
            System.out.println("p2是Woman类的实例");
        }

        if(p2 instanceof Person){
            System.out.println("p2是Person类的实例");
        }

        if(p2 instanceof Object){
            System.out.println("p2是Object类的实例");
        }
    }
}
