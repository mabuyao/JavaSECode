package com.xiaoma08.constructor.exer3;

/**
 * ClassName: CustomerTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 10:59
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer customer = new Customer("Jane", "Smith");

        //Account account = new Account(1000, 2000, 0.0123);
        //customer.setAccount(account);
        customer.setAccount(new Account(1000, 2000, 0.0123));//匿名对象，创建的对象没有名字

        /*
        1.匿名对象往往只能被调用一次
        2.匿名对象常常作为实参赋值给方法
         */

        //针对于客户的账户进行操作
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        //输出客户信息
        System.out.println("Customer [" + customer.getFirstName() + ", " + customer.getLastName() +
                "] has an account: id is " + customer.getAccount().getId() +
                ", annualInterestRate is " + customer.getAccount().getAnnualInterestRate() * 100 +
                "%, balabce is " + customer.getAccount().getBalance());

        new Account(1001, 2000, 0.0123).withdraw(1000);
        System.out.println(new Account(1001, 2000, 0.0123).getBalance());
    }
}
