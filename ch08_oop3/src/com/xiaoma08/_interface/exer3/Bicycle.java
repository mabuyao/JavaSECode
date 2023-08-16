package com.xiaoma08._interface.exer3;

/**
 * ClassName: Bicycle
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 16:58
 * @Version 1.0
 */
public class Bicycle extends Vehicle{
    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("bicycle run");
    }
}
