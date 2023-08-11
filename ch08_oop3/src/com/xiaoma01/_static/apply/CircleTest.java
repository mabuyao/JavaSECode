package com.xiaoma01._static.apply;

/**
 * ClassName: CircleTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/10 17:39
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        Circle c3 = new Circle();
        System.out.println(c3);

        Circle c4 = new Circle(2.3);
        System.out.println(c4);

        System.out.println(Circle.total);
    }
}

class Circle{
    double radius;

    int id;

    static int total;//创建的Circle实例的个数
    private static int init = 1001;//自动给id赋值的基数

    public Circle() {
        this.id = init;
        init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }
}