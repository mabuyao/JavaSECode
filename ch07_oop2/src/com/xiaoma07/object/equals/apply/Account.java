package com.xiaoma07.object.equals.apply;

/**
 * ClassName: Account
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 16:48
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account() {
    }

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0;
    }

}
