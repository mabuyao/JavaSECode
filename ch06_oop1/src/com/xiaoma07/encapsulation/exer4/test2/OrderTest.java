package com.xiaoma07.encapsulation.exer4.test2;

import com.xiaoma07.encapsulation.exer4.test1.Order;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 9:39
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order  = new Order();//Order类不加public导包也没法用

        order.orderPublic = 2;

        order.methodPublic();

        //不能调用
        //order.orderDefault = 1;
        //order.orderPrivate = 3;
        //order.methodPrivate();
        //order.methodDefault();
    }

}
