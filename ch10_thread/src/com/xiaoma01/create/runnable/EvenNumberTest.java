package com.xiaoma01.create.runnable;

/**
 * ClassName: EvenNumberTest
 * Description:
 * ① 创建一个实现Runnable接口的类
 * ② 实现接口中的run() -->将此线程要执行的操作，声明在此方法体中
 * ③ 创建当前实现类的对象
 * ④ 将此对象作为参数传递到Thread类的构造器中，创建Thread类的实例
 * ⑤ Thread类的实例调用start():1.启动线程 2.调用当前线程的run()
 * @Author Mabuyao
 * @Create 2023/8/21 14:36
 * @Version 1.0
 */

//① 创建一个实现Runnable接口的类
class EvenNumberPrint implements Runnable{
    //② 实现接口中的run() -->将此线程要执行的操作，声明在此方法体中
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
public class EvenNumberTest {
    public static void main(String[] args) {
        //③ 创建当前实现类的对象
        EvenNumberPrint evenNumberPrint = new EvenNumberPrint();

        //④ 将此对象作为参数传递到Thread类的构造器中，创建Thread类的实例
        Thread thread = new Thread(evenNumberPrint);

        //⑤ Thread类的实例调用start():1.启动线程 2.调用当前线程的run()
        thread.start();

        // 主线程
        for (int i = 0; i < 100; i++) {
            // 判断是否为奇数
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }
        }


        Thread thread1 = new Thread(evenNumberPrint);
        thread1.start();
    }
}
