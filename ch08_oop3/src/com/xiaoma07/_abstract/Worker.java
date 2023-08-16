package com.xiaoma07._abstract;

/**
 * ClassName: Worker
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 11:20
 * @Version 1.0
 */
public class Worker extends Person{
    @Override
    public void eat() {
        System.out.println("worker eat");
    }

    @Override
    public void breath() {
        System.out.println("worker breath");
    }
}
