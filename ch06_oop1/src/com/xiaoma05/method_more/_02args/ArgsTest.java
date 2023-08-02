package com.xiaoma05.method_more._02args;

/**
 * ClassName: ArgsTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/2 9:31
 * @Version 1.0
 */
public class ArgsTest {
    public static void main(String[] args) {
        ArgsTest test = new ArgsTest();
        test.print();
        test.print(1);
        test.print(1,2);

        test.print(new int[]{1,2,3});//1111
        //可变个数形参等价于数组方法
    }
    public void print(int ... nums){
        System.out.println("1111");
    }//可以重载，默认使用有确定个数形参的方法

    public void print(int i){
        System.out.println("2222");
    }

    public void print(int i, int j){
        System.out.println("3333");
    }
}
