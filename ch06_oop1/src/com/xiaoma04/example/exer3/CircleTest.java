package com.xiaoma04.example.exer3;

/**
 * ClassName: CircleTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 15:34
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();

        c1.radius = 2.3;
        c1.findArea1();

        System.out.println("面积为：" + c1.findArea());
    }
}
