package com.xiaoma07.encapsulation.exer4.test1;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 9:36
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderDefault = 1;
        order.orderPublic = 2;

        order.methodDefault();
        order.methodPublic();

        //不能调用
        //order.orderPrivate = 3;
        //order.methodPrivate();
    }
}
