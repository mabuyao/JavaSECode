package com.xiaoma03.threadsafe.notsafe;

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

    @Override
    public void run() {
        while (true) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (ticket > 0) {
                System.out.println(getName()
                        + "卖票，票号为：" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
public class WindowTest1 {
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
