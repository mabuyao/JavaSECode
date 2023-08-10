package com.xiaoma07.object.tostring.exer;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 17:55
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        color = "white";
        weight = 1.0;
        radius = 1.0;
    }

    public Circle(double radius) {
        color = "white";
        weight = 1.0;
        this.radius = radius;
    }

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

    public double findArea() {
        return Math.PI * radius * radius;
    }

    //重写equals()

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Circle) {
            Circle c = (Circle) obj;
            return this.radius == c.radius;
        }
        return false;
    }

    //重写toString()

    @Override
    public String toString() {
        return "Circle[radius = " + radius + "]";
    }
}
