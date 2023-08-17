package com.xiaoma10._enum;

/**
 * ClassName: SeasonTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/16 11:14
 * @Version 1.0
 */
public class SeasonTest {
    public static void main(String[] args) {

        System.out.println(Season.SPRING);

        System.out.println(Season.SUMMER.getSeasonName());
        System.out.println(Season.SUMMER.getSeasonDesc());
    }
}

//jdk5.0之前定义枚举类的方式
class Season {
    //2.声明当前类的对象的实例变量，使用private final修饰
    private final String seasonName;//季节的名称
    private final String seasonDesc;//季节的描述

    //1.私有化类的构造器
    private Season(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }

    //3.提供实例变量的Get方法

    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4.创建当前类的实例,需要使用public static final修饰
    public static final Season SPRING = new Season("春天","春暖花开");
    public static final Season SUMMER = new Season("夏天","夏日炎炎");
    public static final Season AUTUMN = new Season("秋天","秋高气爽");
    public static final Season WINTER = new Season("冬天","白雪皑皑");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
