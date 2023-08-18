package com.xiaoma12.wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/16 17:26
 * @Version 1.0
 */
public class WrapperTest {
    /*
    （装箱）基本数据类型 ---> 包装类：① 使用包装类的构造器 ② （建议）调用包装类的valueOf(xxx xx)
    （拆箱）包装类 ---> 基本数据类型：调用包装类的xxxValue()
     */

    @Test
    public void test4(){
        //自动装箱  JDK5.0之后
        int num1 = 10;
        Integer in1 = num1;//自动装箱
        System.out.println(in1.toString());

        Integer in2 = num1 + 1;

        Boolean b1 = true;

        Float f1 = 12.3f;

        //自动拆箱

        int num2 = in1;//自动拆箱

        int num3 = in1 + 1;

        //语法糖，本质上还是调用了xxxValue()
    }
    @Test
    public void test3(){
        Account a1 = new Account();
        System.out.println(a1.isFlag1);//false
        System.out.println(a1.isFlag2);//null

        System.out.println(a1.balance1);//0.0
        System.out.println(a1.balance2);//null
    }
    @Test
    public void test2(){
        Integer ii1 = new Integer(12);
        int i1 = ii1.intValue();
        i1 += 1;

        Float ff1 = new Float(12.3);
        float f1 = ff1.floatValue();
    }
    @Test
    public void test1(){
        int i1 = 10;
        Integer ii1 = new Integer(i1);
        System.out.println(ii1.toString());

        float f1 = 12.3f;
        Float ff1 = new Float(f1);
        System.out.println(ff1.toString());

        String s1 = "32.1";
        Float ff2 = new Float(s1);
        System.out.println(ff2.toString());

        boolean b1 = true;
        Boolean bb1 = new Boolean(b1);
        System.out.println(bb1.toString());

        Boolean bb2 = new Boolean("true");
        System.out.println(bb2.toString());

        //推荐使用
        int i2 = 20;
        Integer ii2 = Integer.valueOf(i2);

        Boolean bb3 = Boolean.valueOf("true");

        Float ff3 = Float.valueOf("12.3");
    }

}

class Account{
    boolean isFlag1;
    Boolean isFlag2;

    double balance1;
    Double balance2;
}
