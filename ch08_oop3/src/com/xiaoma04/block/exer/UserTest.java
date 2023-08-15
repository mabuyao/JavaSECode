package com.xiaoma04.block.exer;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/14 17:37
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 = new User("Tom","654321");
        System.out.println(u2.getInfo());
    }
}
