package com.xiaoma08._interface.exer3;

/**
 * ClassName: VehicleTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 17:04
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {
        Developer developer = new Developer();

        //创建三个交通工具，保存在数组中
        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = new Bicycle("捷安特","red");
        vehicles[1] = new ElectricBicycle("雅迪","blue");
        vehicles[2] = new Car("奔驰","black","川A12345");

        for (int i = 0; i < vehicles.length; i++) {
            developer.takingVehicle(vehicles[i]);

            if(vehicles[i] instanceof IPower){
                ((IPower) vehicles[i]).power();
            }
        }
    }
}
