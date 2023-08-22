package com.xiaoma02.method_lifecycle;

/**
 * ClassName: EvenNumberTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/21 17:34
 * @Version 1.0
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        //③ 创建当前Thread的子类的对象
        PrintNumber printNumber = new PrintNumber("线程1");
        printNumber.setName("子线程1");

        //④ 通过对象调用start(): 1.启动线程 2.调用当前线程的run()
        printNumber.start();

        // 主线程
        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            // 判断是否为奇数
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

            if(i == 20){
                try {
                    printNumber.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println("子线程1是否存活：" + printNumber.isAlive());
    }

}


//① 创建一个继承于Thread类的子类
class PrintNumber extends Thread{
    public PrintNumber() {
    }

    public PrintNumber(String name) {
        super(name);
    }

    //② 重写Thread类的run() --->将此线程要执行的操作，声明在此方法体中
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                // ⑤ 调用sleep()方法
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            // 判断是否为偶数
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }
    }
}