package com.xiaoma08._interface.apply;

/**
 * ClassName: USBTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 15:37
 * @Version 1.0
 */
public class USBTest {
    public static void main(String[] args) {
        //1.创建接口实现类的对象
        Computer computer = new Computer();
        Printer printer = new Printer();

        computer.transferData(printer);

        //2.创建接口实现类的匿名对象
        computer.transferData(new Camera());

        //3.创建接口匿名实现类的对象
        System.out.println();
        USB usb1 = new USB() {
            @Override
            public void start() {
                System.out.println("Upan start");
            }

            @Override
            public void stop() {
                System.out.println("Upan stop");
            }
        };
        computer.transferData(usb1);

        //4.创建接口匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("scanner start");
            }

            @Override
            public void stop() {
                System.out.println("scanner stop");
            }
        });
    }
}

class Computer{
    public void transferData(USB usb){
        System.out.println("设备连接成功...");
        usb.start();

        System.out.println("数据传输的细节操作...");

        usb.stop();
    }
}

class Camera implements USB{
    @Override
    public void start() {
        System.out.println("camera start");
    }

    @Override
    public void stop() {
        System.out.println("camera stop");
    }
}
class Printer implements USB{
    @Override
    public void start() {
        System.out.println("printer start");
    }

    @Override
    public void stop() {
        System.out.println("printer stop");
    }
}

interface USB{
    //声明常量
    //USB的长、宽、高...

    //方法
    public abstract void start();
    void stop();
}
