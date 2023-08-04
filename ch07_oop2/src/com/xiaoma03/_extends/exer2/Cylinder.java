package com.xiaoma03._extends.exer2;

/**
 * ClassName: Cylinder
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/4 11:16
 * @Version 1.0
 */
public class Cylinder extends Circle{
    private double length;//高

    public Cylinder() {
        length = 1;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double findVolume(){
        return findArea() * length;
    }
}
