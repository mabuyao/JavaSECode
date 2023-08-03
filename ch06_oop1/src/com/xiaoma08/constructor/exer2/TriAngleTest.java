package com.xiaoma08.constructor.exer2;

/**
 * ClassName: TriAngleTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 10:42
 * @Version 1.0
 */
public class TriAngleTest {
    public static void main(String[] args) {
        TriAngle t1 = new TriAngle();
        System.out.println("面积为：" + t1.findArea());

        t1.setBase(2.3);
        t1.setHeight(3.4);
        System.out.println("面积为：" + t1.findArea());

        TriAngle t2 = new TriAngle(2.4, 4.5);

        System.out.println("底边长为："+t2.getBase());
        System.out.println("高为："+t2.getHeight());
        System.out.println("面积为：" + t2.findArea());
    }
}
