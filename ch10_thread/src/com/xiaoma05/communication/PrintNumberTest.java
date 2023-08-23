package com.xiaoma05.communication;

/**
 * ClassName: PrintNumberTest
 * Description:
 * 使用两个线程打印 1-100。线程1, 线程2 交替打印
 * @Author Mabuyao
 * @Create 2023/8/22 15:10
 * @Version 1.0
 */

class PrintNumber implements Runnable {
    private int number = 1;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                notify();
                if (number <= 100) {
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                    number++;
                    try {
                        wait();//线程一旦执行此方法，就会进入阻塞状态，并释放同步监视器
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    break;
                }
            }
        }
    }
}
public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber printNumber = new PrintNumber();
        Thread thread1 = new Thread(printNumber);
        Thread thread2 = new Thread(printNumber);
        thread1.setName("线程1");
        thread2.setName("线程2");
        thread1.start();
        thread2.start();
    }
}
