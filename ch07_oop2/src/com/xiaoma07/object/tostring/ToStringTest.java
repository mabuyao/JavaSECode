package com.xiaoma07.object.tostring;

import java.io.File;
import java.util.Date;

/**
 * ClassName: ToStringTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 17:18
 * @Version 1.0
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1 = new User("Tom", 12);
        System.out.println(u1.toString());//com.xiaoma07.object.tostring.User@3b07d329  --> User{name = Tom, age = 12}
        System.out.println(u1);//com.xiaoma07.object.tostring.User@3b07d329 此处其实就是调用的toString方法
        //--> User{name = Tom, age = 12}

        String s1 = new String("hello");
        System.out.println(s1.toString());//hello

        File file = new File("d\\abc.txt");
        System.out.println(file.toString());//d\abc.txt

        Date date = new Date();
        System.out.println(date);//Tue Aug 08 17:41:00 CST 2023
    }
}

class User {
    String name;
    int age;

    public User() {
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //手动实现toString()
//    @Override
//    public String toString() {
//        return "User{name = " + name + ", age = " + age + "}";
//    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
