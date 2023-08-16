package com.xiaoma08._interface.exer1;

/**
 * ClassName: EatableTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 16:25
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables = new Eatable[3];

        eatables[0] = new Chinese();//多态性
        eatables[1] = new American();
        eatables[2] = new Indian();

        for (int i = 0; i < eatables.length; i++) {
            eatables[i].eat();
        }
    }
}
