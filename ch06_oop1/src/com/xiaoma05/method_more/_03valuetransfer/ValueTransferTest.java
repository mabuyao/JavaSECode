package com.xiaoma05.method_more._03valuetransfer;

/**
 * ClassName: ValueTransferTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/2 9:58
 * @Version 1.0
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        //1.基本数据类型的局部变量
        int m = 10;
        int n = m;//传递的是数据值

        System.out.println("m = " + m + ", n = " + n);//m = 10, n = 10

        m++;

        System.out.println("m = " + m + ", n = " + n);//m = 11, n = 10

        //2.引用数据类型的局部变量
        //2.1 数组类型
        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = arr1;//传递的是地址值

        System.out.println(arr1[0]);//1
        arr2[0] = 10;
        System.out.println(arr1[0]);//10

        //2.2 对象类型
        Order order1 = new Order();
        order1.orderId = 1001;

        Order order2 = order1;//传递的是地址值
        order2.orderId = 1002;

        System.out.println(order1.orderId);//1002

    }
}

class Order{
    int orderId;
}
