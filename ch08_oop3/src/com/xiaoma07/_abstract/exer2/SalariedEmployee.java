package com.xiaoma07._abstract.exer2;

/**
 * ClassName: SalariedEmployee
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 14:17
 * @Version 1.0
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" + super.toString() +
                ", monthlySalary=" + monthlySalary +
                '}';
    }
}
