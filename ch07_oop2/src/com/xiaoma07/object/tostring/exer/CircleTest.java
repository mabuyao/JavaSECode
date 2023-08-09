package com.xiaoma07.object.tostring.exer;

/**
 * ClassName: CircleTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 18:03
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(2.3);
        Circle c2 = new Circle("red",2.0,3.4);

        System.out.println("颜色是否相等？"+c1.getColor().equals(c2.getColor()));//false
    }
}
