package com.xiaoma10._enum.apply;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/16 14:30
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Tom",21,Status.BUSY);
        System.out.println(e1);
    }
}
