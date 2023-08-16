package com.xiaoma08._interface.exer3;

/**
 * ClassName: Car
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 17:00
 * @Version 1.0
 */
public class Car extends Vehicle implements IPower{
    private String carNumber;

    public Car() {
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        System.out.println("car run");
    }

    @Override
    public void power() {
        System.out.println("car use gas");
    }
}
