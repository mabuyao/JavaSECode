package com.xiaoma07._abstract.exer1;

/**
 * ClassName: GeometricObject
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/8 11:36
 * @Version 1.0
 */
public abstract class GeometricObject {
    protected String color;
    protected double weight;


    protected GeometricObject(String color, double weight) {
        super();
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double findArea();
}
