package com.xiaoma03.field_method.field.exer2;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 11:26
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.id = 1001;
        emp1.name = "Jack";
        //emp1.name = new String("Jack");
        emp1.age = 24;
        emp1.salary = 8900;
        emp1.birthday = new MyDate();
        emp1.birthday.year = 1998;
        emp1.birthday.month = 2;
        emp1.birthday.day = 28;

        //打印员工信息
        System.out.println("id = " + emp1.id + ", name = " + emp1.name +
                ", age = " + emp1.age + ", salary = " + emp1.salary +
                ", birthday = [" + emp1.birthday.year + "年" +
                emp1.birthday.month + "月" + emp1.birthday.day + "日]");
    }
}
