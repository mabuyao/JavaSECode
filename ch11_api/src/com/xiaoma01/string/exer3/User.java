package com.xiaoma01.string.exer3;

/**
 * ClassName: User
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/23 14:37
 * @Version 1.0
 */
public class User {
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return name + "-" + password;
    }
}
