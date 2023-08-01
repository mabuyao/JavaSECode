package com.xiaoma03.field_method.method.exer;

/**
 * ClassName: Employee
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 11:11
 * @Version 1.0
 */
public class Employee {
    //属性
    int id;
    String name;
    int age;
    double salary;

    //定义一个方法，用于显示员工属性信息
    public void show(){
        System.out.println("id = " + id + ", name = " + name +
                ", age = " + age + ", salary = " + salary);
    }

    public String show1(){
        return "id = " + id + ", name = " + name + ", age = " + age + ", salary = " + salary;
    }
}
