package com.xiaoma03._extends;

/**
 * ClassName: ExtendTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/4 10:33
 * @Version 1.0
 */
public class ExtendTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "tony";
        p1.eat();

        System.out.println(p1.toString());

        Student s1 = new Student();
        s1.name = "Tom";
        s1.setAge(15);
        s1.eat();
        s1.show1();

        System.out.println(s1.getClass().getSuperclass());
        System.out.println(p1.getClass().getSuperclass());
    }
}
