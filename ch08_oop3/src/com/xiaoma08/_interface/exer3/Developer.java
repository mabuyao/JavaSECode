package com.xiaoma08._interface.exer3;

/**
 * ClassName: Developer
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 16:55
 * @Version 1.0
 */
public class Developer {
    private String name;
    private int age;

    public Developer() {
    }

    public Developer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void takingVehicle(Vehicle vehicle){
        vehicle.run();
    }
}
