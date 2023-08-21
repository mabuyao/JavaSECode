package com.xiaoma03._throws;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: OverrideTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/17 17:35
 * @Version 1.0
 */
public class OverrideTest {
    public static void main(String[] args) {
        Father father = new Son();

        try {
            father.method1();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Number number = father.method4();
    }
}

class Father {
    public void method1() throws IOException {

    }

    public void method2() {

    }

    public void method3(){

    }

    public Number method4(){
        return null;
    }
}

class Son extends Father {
    @Override
    public void method1() throws FileNotFoundException {

    }

//    @Override
//    public void method2() throws FileNotFoundException {
//
//    }

    @Override
    public void method3() throws RuntimeException{

    }

    @Override
    public Integer method4(){
        return null;
    }
}