package com.xiaoma08._interface.jdk8;

/**
 * ClassName: CompareA
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 17:11
 * @Version 1.0
 */
public interface CompareA {
    //属性：声明为public static final
    //方法：jdk8之前：只能声明为抽象方法

    //方法：jdk8中：静态方法
    public static void method1(){
        System.out.println("CompareA:beijing");
    }

    //方法：jdk8中：默认方法
    public default void method2(){
        System.out.println("CompareA:shanghai");
    }

    public default void method3(){
        System.out.println("CompareA:guangzhou");
    }

    public default void method4(){
        System.out.println("CompareA:shenzhen");
    }

    //jdk9新特性：定义私有方法
    private void method5(){
        System.out.println("private method");
    }
}
