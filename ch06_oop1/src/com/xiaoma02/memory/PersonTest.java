package com.xiaoma02.memory;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 10:09
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建对象、类的实例化
        Person p1 = new Person();

        //通过对象调用属性或者方法
        p1.name = "Xiaoma";
        p1.age = 22;
        p1.gender = '男';

        System.out.println("name = " + p1.name + ", age = " + p1.age + ", gender = " + p1.gender);

        p1.eat();
        p1.sleep(8);
        p1.interests("画画");

        //再创建Person类的一个实例
        Person p2 = new Person();
        p2.name = "Rose";
        p2.age = 18;
        p2.gender = '女';

        System.out.println("name = " + p2.name + ", age = " + p2.age + ", gender = " + p2.gender);

        System.out.println("name = " + p1.name + ", age = " + p1.age + ", gender = " + p1.gender);
    }
}
