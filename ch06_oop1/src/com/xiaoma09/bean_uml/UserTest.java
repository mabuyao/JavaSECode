package com.xiaoma09.bean_uml;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 11:22
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();

        System.out.println(u1.age);

        User u2 = new User(2);
        System.out.println(u2.age);
    }
}

class User {
    String name;
    int age = 1;

    public User(){

    }

    public User(int a){
        age = a;
    }
}
