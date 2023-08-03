package com.xiaoma05.method_more._04recursion;

/**
 * ClassName: RecursionTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/2 14:53
 * @Version 1.0
 */
public class RecursionTest {
    public static void main(String[] args) {
        RecursionTest test = new RecursionTest();

        System.out.println(test.getSum(100));

        System.out.println(test.getSum1(100));

        System.out.println(test.getMul(5));

        System.out.println(test.f(10));
    }

    public int getSum(int num){
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    public int getSum1(int num){
        if(num == 1){
            return 1;
        }else{
            return getSum1(num - 1) + num;
        }
    }

    public int getMul(int n){
        if(n == 1){
            return 1;
        }else{
            return getMul(n - 1) * n;
        }
    }

    public int f(int n){
        if(n == 1){
            return 1;
        }else if(n == 2){
            return 1;
        }else{
            return f(n - 1) + f(n - 2);
        }
    }
    /*
    如下递归方法的调用会导致栈溢出
     */
    /*
    public void method1(){
        System.out.println("method1()....");
        method1();
    }
     */
}
