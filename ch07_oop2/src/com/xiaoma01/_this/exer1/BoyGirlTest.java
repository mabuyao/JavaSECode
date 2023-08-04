package com.xiaoma01._this.exer1;

/**
 * ClassName: BoyGirlTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 16:43
 * @Version 1.0
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy("jack", 24);

        Girl girl1 = new Girl("rose", 20);

        girl1.marry(boy1);

        boy1.shout();

        Girl girl2 = new Girl("jerry", 18);
        int compare = girl1.compare(girl2);
        if (compare > 0) {
            System.out.println(girl1.getName() + "大");
        } else if (compare < 0) {
            System.out.println(girl2.getName() + "大");
        } else {
            System.out.println("一样大");
        }
    }
}
