package com.xiaoma05.method_more._04recursion.exer2;

/**
 * ClassName: RecusionExer2
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/2 15:30
 * @Version 1.0
 */
public class RecusionExer2 {
    public static void main(String[] args) {
        RecusionExer2 exer = new RecusionExer2();
        int month = 24;
        System.out.println("兔子的对数为:" + exer.getRabbitNumber(month) + "对");

    }

    public int getRabbitNumber(int month){
        if(month == 1){
            return 1;
        } else if (month == 2) {
            return 1;
        }else {
            return getRabbitNumber(month - 1) + getRabbitNumber(month - 2);
        }
    }
}
