package com.xiaoma04.example.exer3;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 15:20
 * @Version 1.0
 */
public class Circle {
    //属性
    double radius;//半径

    //方法
    public double findArea(){
        return 3.14 * radius * radius;
    }

    public void findArea1(){
        System.out.println("面积为：" + 3.14 * radius * radius);
    }

    //错误的思路
    public void findArea2(double r){
        System.out.println("面积为：" + 3.14 * r * r);
    }
}
