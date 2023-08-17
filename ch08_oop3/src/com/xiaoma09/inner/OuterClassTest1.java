package com.xiaoma09.inner;

/**
 * ClassName: OuterClassTest1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/16 10:10
 * @Version 1.0
 */
public class OuterClassTest1 {

    //说明：局部内部类的使用
    public void method1(){
        //局部内部类
        class A{
            //可以声明属性。方法等
        }
    }


    //开发中的场景
    public Comparable getInstance(){

        //提供了实现了Comparable接口的类
        //方式1：提供了接口的实现类的匿名对象
//        class MyComparable implements Comparable{
//            @Override
//            public int compareTo(Object o) {
//                return 0;
//            }
//        }

//        return new MyComparable();

        //方式2：提供了接口的匿名实现类的匿名对象
        return new Comparable() {
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
    }
}
