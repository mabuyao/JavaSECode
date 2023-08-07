package com.xiaoma05._super.exer3;

/**
 * ClassName: CheckAccountTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/7 16:54
 * @Version 1.0
 */
public class CheckAccountTest {
    public static void main(String[] args) {
        CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);

        checkAccount.withdraw(5000);
        System.out.println("您的账户余额为：" + checkAccount.getBalance());
        System.out.println("您的可透支额为：" + checkAccount.getOverdraft());

        checkAccount.withdraw(18000);
        System.out.println("您的账户余额为：" + checkAccount.getBalance());
        System.out.println("您的可透支额为：" + checkAccount.getOverdraft());

        checkAccount.withdraw(3000);
        System.out.println("您的账户余额为：" + checkAccount.getBalance());
        System.out.println("您的可透支额为：" + checkAccount.getOverdraft());
    }
}
