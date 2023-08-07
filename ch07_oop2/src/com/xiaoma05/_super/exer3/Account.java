package com.xiaoma05._super.exer3;

/**
 * ClassName: Account
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/7 16:35
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    /**
     * 取钱的操作
     * @param amount  要取的额度
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("余额不足！");
        }
    }

    /**
     * 存钱的操作
     * @param amount 要存的额度
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
