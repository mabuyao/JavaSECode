package com.xiaoma10._enum;

/**
 * ClassName: SeasonTest1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/16 11:32
 * @Version 1.0
 */
public class SeasonTest1 {
    public static void main(String[] args) {
        System.out.println(Season1.SPRING.getClass());
        System.out.println(Season1.SPRING.getClass().getSuperclass());

        System.out.println(Season1.SPRING);

        System.out.println(Season1.SPRING.name());

        Season1[] values =  Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        String objName = "WINTER";
        Season1 season1 = Season1.valueOf(objName);
        System.out.println(season1);

        System.out.println(Season1.AUTUMN.ordinal());

    }
}

interface Info{
    void show();
}
//jdk5.0中使用enum关键字定义枚举类
enum Season1 implements Info{
    //1.必须在枚举类的开头声明多个对象，对象之间用逗号隔开
    SPRING("春天","春暖花开"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","秋高气爽"),
    WINTER("冬天","白雪皑皑");

    //2.声明当前类的对象的实例变量，使用private final修饰
    private final String seasonName;//季节的名称
    private final String seasonDesc;//季节的描述

    //3.私有化类的构造器
    private Season1(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //4.提供实例变量的Get方法

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("This is Season");
    }
}
