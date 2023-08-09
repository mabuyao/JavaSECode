package com.xiaoma06.polymorphism.exer3;

/**
 * ClassName: Student
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 14:14
 * @Version 1.0
 */
public class Student extends Person {
    protected String school = "pku";

    public String getInfo() {
        return "Name: " + name + "\nage: " + age
                + "\nschool: " + school;
    }
}
