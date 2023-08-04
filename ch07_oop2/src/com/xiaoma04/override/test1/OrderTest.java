package com.xiaoma04.override.test1;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/4 11:45
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {

    }

    public void method1(){
        Order order = new Order();

        //可以调用的属性及方法如下
        order.orderProtested = 1;
        order.orderPublic = 1;
        order.orderDefault = 1;

        order.methodDefault();
        order.methodPublic();
        order.methodProtected();
    }
}
