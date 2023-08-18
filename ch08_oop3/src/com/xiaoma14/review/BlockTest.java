package com.xiaoma14.review;

/**
 * ClassName: BlockTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/17 14:43
 * @Version 1.0
 */
public class BlockTest {
    static {
        System.out.println("static block");
    }
    {
        System.out.println("hello");
    }
    public BlockTest(){

    }
}
