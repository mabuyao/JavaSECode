package com.xiaoma08._interface.exer3;

/**
 * ClassName: ElectricBicycle
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 16:59
 * @Version 1.0
 */
public class ElectricBicycle extends Vehicle implements IPower{
    public ElectricBicycle() {
    }

    public ElectricBicycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("ElectricBicycle run");
    }

    @Override
    public void power() {
        System.out.println("ElectricBicycle ues electric");
    }
}
