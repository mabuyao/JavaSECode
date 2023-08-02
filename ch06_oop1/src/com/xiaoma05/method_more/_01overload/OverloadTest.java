package com.xiaoma05.method_more._01overload;

/**
 * ClassName: OverloadTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/1 17:39
 * @Version 1.0
 */
public class OverloadTest {
    public static void main(String[] args) {
        OverloadTest test = new OverloadTest();
        test.add(1,2,3);
    }
    public void add(int i, int j){

    }

    public void add(int i, int j, int k){

    }

    public void add(int i, String str){

    }
}
