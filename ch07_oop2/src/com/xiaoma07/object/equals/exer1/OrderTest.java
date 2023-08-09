package com.xiaoma07.object.equals.exer1;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 16:57
 * @Version 1.0
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1001,"orderAA");
        Order order2 = new Order(1001,"orderAA");
        System.out.println(order1.equals(order2));//true

        Order order3 = new Order(1002,new String("orderBB"));
        Order order4 = new Order(1002,new String("orderBB"));
        System.out.println(order3.equals(order4));//true

        String str1 = "aa";
        String str2 = "aa";
        System.out.println(str1.equals(str2));//true
    }
}
