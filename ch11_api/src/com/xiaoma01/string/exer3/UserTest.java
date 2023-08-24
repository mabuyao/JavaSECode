package com.xiaoma01.string.exer3;

import java.util.Scanner;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/23 14:39
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        //1.创建User对象
        User[] users = new User[3];
        users[0] = new User("Tom", "8888");
        users[1] = new User("xiaoma", "123");
        users[2] = new User("Jerry", "6666");

        System.out.println("库中的用户有：");
        for (int i = 0; i < users.length; i++) {
            System.out.println(users[i].toString());
        }

        //2.用户登录实例化Scanner，获取用户输入的用户名和密码
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入用户名：");
        String name = scanner.next();
        System.out.print("请输入密码：");
        String password = scanner.next();

        //3.遍历数组，判断是否有该用户
        boolean isFlag = true;
        for (int i = 0; i < users.length; i++) {
            if(users[i].getName().equals(name)){
                isFlag = false;
                if(users[i].getPassword().equals(password)){
                    System.out.println("登录成功,"+name);
                }else{
                    System.out.println("密码错误");
                }
                break;
            }
        }
        if(isFlag){
            System.out.println("没有该用户");
        }
    }
}
