package com.xiaoma03.threadsafe.threadsafe;

/**
 * ClassName: WindowTest1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/22 11:06
 * @Version 1.0
 */
class Window1 extends Thread {
    private static int ticket = 100;

//    private static Object obj = new Object();
    static boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            show();
        }
    }

    //private synchronized void show(){}//同步监视器：this
    private static synchronized void show(){
        //同步监视器：Window1.class
        //Class clz = Window1.class;
        if (ticket > 0) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
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
        Window1 window1 = new Window1();
        Window1 window2 = new Window1();
        Window1 window3 = new Window1();

        window1.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window1.start();
        window2.start();
        window3.start();
    }
}
