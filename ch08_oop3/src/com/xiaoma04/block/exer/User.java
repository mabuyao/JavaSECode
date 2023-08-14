package com.xiaoma04.block.exer;

/**
 * ClassName: User
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/11 16:48
 * @Version 1.0
 */
public class User {
    private String userName;
    private String password;
    private long registrationTime;//注册时间

    public long getRegistrationTime() {
        return registrationTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
