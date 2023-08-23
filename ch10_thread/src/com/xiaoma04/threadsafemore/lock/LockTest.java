package com.xiaoma04.threadsafemore.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * ClassName: WindowTest1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/22 9:27
 * @Version 1.0
 */

class Window extends Thread {
    private static int ticket = 100;

    //1.创建lock的实例，需要确保多个线程共用一个lock实例！需要考虑将次对象声明为static final
    private static final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            try{
                //2.调用lock()方法，锁定对共享资源的调用
                lock.lock();
                if (ticket > 0) {
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()
                            + "卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            } finally {
                //3.调用unlock()方法，释放对共享数据的锁定
                lock.unlock();
            }
        }
    }
}
public class LockTest {
    public static void main(String[] args) {
        Window window1 = new Window();
        Window window2 = new Window();
        Window window3 = new Window();

        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window1.start();
        window2.start();
        window3.start();
    }
}
