package com.xiaoma05._super.exer2;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/4 11:16
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle(){
        this.radius = 1;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }
}
