package com.xiaoma05.exer.exer3;

/**
 * ClassName: Exer3
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/18 10:56
 * @Version 1.0
 */
public class Exer3 {
    public static void main(String[] args) {
        //1.使用有参的构造器
        try {
//        Person p1 = new Person("Tom", 100);
            Person p1 = new Person("Tom", -10);
            System.out.println(p1);
        }catch (NoLifeValueException e) {
            System.out.println(e.getMessage());
        }

        //2.使用无参的构造器
        Person p2 = new Person();
        try {
            p2.setName("Jerry");
            p2.setLifeValue(-100);
            System.out.println(p2);
        }catch (NoLifeValueException e) {
            System.out.println(e.getMessage());
        }
    }
}
