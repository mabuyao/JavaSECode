package com.xiaoma03.field_method.field.exer1;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 11:11
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        //创建类的实例
        Employee emp1 = new Employee();

        System.out.println(emp1);//地址值 com.xiaoma03.field_method.field.exer1.Employee@3b07d329

        System.out.println("id = " + emp1.id + ", name = " + emp1.name +
                ", age = " + emp1.age + ", salary = " + emp1.salary);
        //id = 0, name = null, age = 0, salary = 0.0

        emp1.id = 1001;
        emp1.name = "Tom";
        emp1.age = 22;
        emp1.salary = 3300;

        System.out.println("id = " + emp1.id + ", name = " + emp1.name +
                ", age = " + emp1.age + ", salary = " + emp1.salary);

        //创建Employee的第二个对象
        Employee emp2 = new Employee();

        System.out.println("id = " + emp2.id + ", name = " + emp2.name +
                ", age = " + emp2.age + ", salary = " + emp2.salary);
        //id = 0, name = null, age = 0, salary = 0.0
    }
}
