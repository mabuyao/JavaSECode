package com.xiaoma08.constructor.exer2;

/**
 * ClassName: TriAngle
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 10:38
 * @Version 1.0
 */
public class TriAngle {
    private double base;//底边长
    private double height;

    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }

    public TriAngle() {

    }

    public TriAngle(double b, double h) {
        base = b;
        height = h;
    }

    public double findArea() {
        return base * height / 2;
    }
}
