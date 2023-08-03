package com.xiaoma08.constructor;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 10:14
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.eat();

        Person p2 = new Person(19);
        System.out.println(p2.age);
    }
}
