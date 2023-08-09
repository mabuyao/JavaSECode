package com.xiaoma06.polymorphism.exer1;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 11:37
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
