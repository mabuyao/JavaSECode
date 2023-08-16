package com.xiaoma05.field;

/**
 * ClassName: FieldTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 9:54
 * @Version 1.0
 */
public class FieldTest {
    public static void main(String[] args) {
        Order o1 = new Order();
        System.out.println(o1.orderId);
    }
}

class Order{
    int orderId = 1;
    {
        orderId = 2;
    }

    public Order(){
        orderId = 3;
    }
    public Order(int orderId){
        this.orderId = orderId;
    }
    public void eat(){
        sleep();
    }

    public void sleep(){
        System.out.println("sleep");
    }
}
