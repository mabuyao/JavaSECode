package com.xiaoma05.method_more._01overload.exer;

/**
 * ClassName: OverloadExer
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/2 9:17
 * @Version 1.0
 */
public class OverloadExer {
    public void mOL(int num){
        System.out.println(num * num);
    }

    public void mOL(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public void mOL(String message){
        System.out.println(message);
    }

    public int max(int i, int j){
        return (i >= j) ? i : j;
    }

    public double max(double d1, double d2){
        return (d1 >= d2) ? d1 : d2;
    }

    public double max(double d1, double d2, double d3){
        double tempMax = max(d1, d2);
        return max(tempMax, d3);
    }
}
