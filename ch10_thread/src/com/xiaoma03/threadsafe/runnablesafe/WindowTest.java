package com.xiaoma03.threadsafe.runnablesafe;

/**
 * ClassName: WindowTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/22 9:22
 * @Version 1.0
 */

class SaleTicket implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName()
                            + "卖票，票号为：" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
public class WindowTest {
    public static void main(String[] args) {
        SaleTicket saleTicket = new SaleTicket();

        Thread thread1 = new Thread(saleTicket);
        Thread thread2 = new Thread(saleTicket);
        Thread thread3 = new Thread(saleTicket);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
