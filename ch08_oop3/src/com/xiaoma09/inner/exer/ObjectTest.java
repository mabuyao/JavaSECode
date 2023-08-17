package com.xiaoma09.inner.exer;

/**
 * ClassName: ObjectTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/16 10:22
 * @Version 1.0
 */
public class ObjectTest {
    public static void main(String[] args) {
//        SubObject sub1 = new SubObject();
//        sub1.test();

        //提供一个继承于Object的匿名子类的匿名对象
        new Object(){
            public void test(){
                System.out.println("xiaoma");
            }
        }.test();
    }
}

class SubObject extends Object{
    public void test(){
        System.out.println("xiaoma");
    }
}
