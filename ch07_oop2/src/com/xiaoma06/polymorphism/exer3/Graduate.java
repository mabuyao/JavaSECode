package com.xiaoma06.polymorphism.exer3;

/**
 * ClassName: Graduate
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 14:14
 * @Version 1.0
 */
public class Graduate extends Student {
    public String major = "IT";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school + "\nmajor:" + major;
    }
}
