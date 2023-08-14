package com.xiaoma01._static.exer1;

/**
 * ClassName: Account
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/10 17:48
 * @Version 1.0
 */
public class Account {
    private int id;//账号
    private String password;
    private double balance;
    private static double interestRate;
    private static double minBalance = 1.0;//最小余额
    private static int init = 1001;//用于自动生成ID的基数

    public Account() {
        this.id = init;
        init++;
        password = "000000";
    }

    public Account(String password, double balance) {
        this.password = password;
        this.balance = balance;
        this.id = init;
        init++;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
