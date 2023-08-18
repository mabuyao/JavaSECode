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
    }
}

class Father{
    public void method1()throws IOException {

    }
}

class Son extends Father{
    @Override
    public void method1()throws FileNotFoundException {

    }
}