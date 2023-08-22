package com.xiaoma01.create.exer1;

/**
 * ClassName: PrintNumberTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/21 14:27
 * @Version 1.0
 */
class EvenNumberPrint extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // 判断是否为偶数
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

class OddNumberPrint extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            // 判断是否为奇数
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}

public class PrintNumberTest {
    public static void main(String[] args) {
        //方式一
//        EvenNumberPrint evenNumberPrint = new EvenNumberPrint();
//        OddNumberPrint oddNumberPrint = new OddNumberPrint();
//
//        evenNumberPrint.start();
//        oddNumberPrint.start();

        //方式2：创建Thread类的匿名子类的匿名对象
//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    // 判断是否为偶数
//                    if (i % 2 == 0){
//                        System.out.println(Thread.currentThread().getName() + ":" + i);
//                    }
//                }
//            }
//        }.start();
//
//        new Thread(){
//            @Override
//            public void run() {
//                for (int i = 0; i < 100; i++) {
//                    // 判断是否为奇数
//                    if (i % 2 != 0){
//                        System.out.println(Thread.currentThread().getName() + ":" + i);
//                    }
//                }
//            }
//        }.start();

        //方式3：使用实现Runnable接口的匿名类的匿名对象
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++){
                    if (i % 2 == 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++){
                    if (i % 2 != 0){
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                    }
                }
            }
        }).start();
    }
}
