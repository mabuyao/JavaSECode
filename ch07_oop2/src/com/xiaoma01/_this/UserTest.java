package com.xiaoma01._this;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 16:18
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User user1 = new User("Tom",18);

    }
}

class User {
    String name;
    int age;

    public User() {
        //模拟对象创建时，需要初始化50行代码
    }

    public User(String name) {
        this();//调用空参的构造器
        this.name = name;
    }

    public User(String name, int age) {
        this(name);//调用参数为name的构造器
        //this.name = name;
        this.age = age;
    }
}
