package com.xiaoma04.override.exer1;

/**
 * ClassName: KidsTets
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/4 11:12
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids kid = new Kids();

        kid.setSex(1);
        kid.setSalary(100);
        kid.setYearsOld(12);

        //来自父类的方法
        kid.employeed();
        kid.manOrWoman();

        kid.printAge();
    }
}
