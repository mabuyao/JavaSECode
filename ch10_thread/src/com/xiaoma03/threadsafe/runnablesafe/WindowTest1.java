package com.xiaoma03.threadsafe.runnablesafe;

/**
 * ClassName: WindowTest1
 * Description:
 * 使用同步方法解决实现Runnable接口的线程安全问题
 * @Author Mabuyao
 * @Create 2023/8/22 10:58
 * @Version 1.0
 */
class SaleTicket1 implements Runnable {
    private int ticket = 100;

    boolean isFlag = true;
    @Override
    public void run() {
        while (isFlag) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            saleTicket();
        }
    }

    public synchronized void saleTicket(){//同步监视器：this。此时this代表唯一的SaleTicket1的对象
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName()
                    + "卖票，票号为：" + ticket);
            ticket--;
        } else {
            isFlag = false;
        }
    }
}
public class WindowTest1 {
    public static void main(String[] args) {
        SaleTicket1 saleTicket = new SaleTicket1();

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