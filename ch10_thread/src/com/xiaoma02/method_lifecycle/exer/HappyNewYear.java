package com.xiaoma02.method_lifecycle.exer;

/**
 * ClassName: HappyNewYear
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/22 11:18
 * @Version 1.0
 */
public class HappyNewYear {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
             try {
                Thread.sleep(1000);
                System.out.println(i);
             } catch (InterruptedException e) {
                    e.printStackTrace();
             }
             if(i == 1){
                 System.out.println("Happy New Year!");
             }
        }
    }
}
