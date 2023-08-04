package com.xiaoma04.override.test1;

/**
 * ClassName: Order
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/4 11:37
 * @Version 1.0
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtested;
    public int orderPublic;

    private void methodPrivate() {
        System.out.println("methodPrivate");
    }

    void methodDefault() {
        System.out.println("methodDefault");
    }

    protected void methodProtected() {
        System.out.println("methodProtected");
    }

    public void methodPublic() {
        System.out.println("methodPublic");
    }

    public void show() {
        orderPrivate = 1;
        orderDefault = 1;
        orderProtested = 1;
        orderPublic = 1;

        methodPrivate();
        methodDefault();
        methodProtected();
        methodPublic();
    }
}
