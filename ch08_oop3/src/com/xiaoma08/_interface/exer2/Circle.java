package com.xiaoma08._interface.exer2;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 16:30
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
