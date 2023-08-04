package com.xiaoma04.override.test2;

import com.xiaoma04.override.test1.Order;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/4 14:23
 * @Version 1.0
 */
public class OrderTest {
    public void method(){
        Order order = new Order();
        order.orderPublic = 1;
        order.methodPublic();

        //其他三个权限修饰符修饰的属性和方法都无法调用了
    }
}
