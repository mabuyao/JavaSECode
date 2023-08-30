package com.xiaoma05.map.exer2;

import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName: CityMapTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/29 10:56
 * @Version 1.0
 */
public class CityMapTest {
    public static void main(String[] args) {
        //1.获取Map，并遍历map中的所有的key
        Map map = CityMap.model;

        Set provinces = map.keySet();
        for(Object province : provinces){
            System.out.print(province + "\t\t");
        }

        System.out.println();
        //2.根据提示，从键盘获取省份值，判断此省份是否存在，如果存在遍历其value中的各个城市
        //如果不存在，提示用户重新输入
        Scanner scan = new Scanner(System.in);
        String[] cities;
        while (true){
            System.out.println("请选择你所在的省份");
            String province = scan.next();
            //获取省份对应的各个城市构成的String[]
            cities = (String[]) map.get(province);

            if(cities == null || cities.length == 0){
                System.out.println("你输入的省份有误，请重新输入");
            }else {
                break;//意味着用户输入的省份存在，跳出当前循环
            }
        }
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + "\t\t");
        }
        System.out.println();
        //3.根据提示，从键盘获取城市，遍历各个城市构成的String[]，判断输入的城市是否存在于此数组中
        //如果存在，信息登记完毕。如果不存在，提示用户重新输入。
        l:while (true){
            System.out.println("请选择你所在的城市");
            String city = scan.next();

            for (int i = 0; i < cities.length; i++) {
                if(city.equals(cities[i])){
                    System.out.println("信息登记完毕");
                    break l;//意味着用户输入的城市存在，跳出while循环
                }
            }

            System.out.println("你输入的省份有误，请重新输入");
        }
        scan.close();
    }
}
