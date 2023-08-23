package com.xiaoma03.threadsafe.threadsafe;

/**
 * ClassName: WindowTest1
 * Description:
 * 使用继承Thread类的方式实现卖票
 * 使用同步代码块解决继承Thread类的方式的线程安全问题
 * @Author Mabuyao
 * @Create 2023/8/22 9:27
 * @Version 1.0
 */

class Window extends Thread {
    private static int ticket = 100;

//    private static Object obj = new Object();

    @Override
    public void run() {
        while (true) {
//            synchronized (this) {//this：此时的this代表着t1,t2,t3三个对象
//            synchronized (obj) {//obj：使用static修饰以后，就能保证其唯一性
            synchronized (Window.class) {//结构：Class clz = Window.class; Window.class只会加载一次
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
}
public class WindowTest {
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
