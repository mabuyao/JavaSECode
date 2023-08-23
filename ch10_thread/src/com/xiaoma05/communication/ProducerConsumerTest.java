package com.xiaoma05.communication;

/**
 * ClassName: ProducerConsumerTest
 * Description:
 * 生产者(Productor)将产品交给店员(Clerk)，而消费者(Customer)从店员处取走产品，店员一次只能持有
 * 固定数量的产品(比如:20），如果生产者试图生产更多的产品，店员会叫生产者停一下，如果店中有空位放产品
 * 了再通知生产者继续生产；如果店中没有产品了，店员会告诉消费者等一下，如果店中有产品了再通知消费者来
 * 取走产品。
 *
 * 分析：
 * 1. 是否是多线程问题？是，生产者线程，消费者线程
 * 2. 是否有共享数据？是，店员（或产品）
 * 3. 如何解决线程的安全问题？同步机制, 有三种方法
 * 4. 是否涉及线程的通信？是
 *
 * @Author Mabuyao
 * @Create 2023/8/22 15:32
 * @Version 1.0
 */

class Clerk{//店员

    private  int productNum = 0;//产品数量

    //增加产品数量的方法
    public void addProduct(){
        synchronized (this){
            if (productNum < 20){
                productNum++;
                System.out.println(Thread.currentThread().getName() + ": 开始生产第" + productNum + "个产品");
                notify();
            }else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    //减少产品数量的方法
    public void minusProduct(){
        synchronized (this){
            if (productNum > 0){
                System.out.println(Thread.currentThread().getName() + ": 开始消费第" + productNum + "个产品");
                productNum--;
                notify();
            }else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Producer extends Thread{//生产者

    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("生产者开始生产产品...");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.addProduct();
        }
    }
}

class Consumer extends Thread{//消费者

    private Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        while (true){
            System.out.println("消费者开始消费产品...");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.minusProduct();
        }
    }
}
public class ProducerConsumerTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producer producer = new Producer(clerk);
        Consumer consumer1 = new Consumer(clerk);
        Consumer consumer2 = new Consumer(clerk);

        producer.setName("生产者");
        consumer1.setName("消费者1");
        consumer2.setName("消费者2");

        producer.start();
        consumer1.start();
        consumer2.start();
    }
}
