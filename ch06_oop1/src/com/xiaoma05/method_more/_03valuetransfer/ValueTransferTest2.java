package com.xiaoma05.method_more._03valuetransfer;

/**
 * ClassName: ValueTransferTest2
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/2 11:33
 * @Version 1.0
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        ValueTransferTest2 test = new ValueTransferTest2();
        int m = 10;
        int n = 20;

        System.out.println("m = " + m + ", n = " + n);

        //交换两个变量的值
        /*
        int temp = m;
        m = n;
        n = temp;
         */
        test.swap(m, n);

        System.out.println("m = " + m + ", n = " + n);
    }

    public void swap(int m, int n){
        int temp = m;
        m = n;
        n = temp;
    }
}
