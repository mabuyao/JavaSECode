package com.xiaoma07.encapsulation.exer4.test1;

/**
 * ClassName: Order
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 9:32
 * @Version 1.0
 */
public class Order {
    //声明不同权限的属性
    private int orderPrivate;
    int orderDefault;
    public int orderPublic;

    private void methodPrivate(){
        System.out.println("methodPrivate");
    }

    void methodDefault(){
        System.out.println("methodDefault");
    }

    public void methodPublic(){
        System.out.println("methodPublic");
    }

    public void test(){
        orderDefault = 1;
        orderPublic = 2;
        orderPrivate = 3;
    }
}
