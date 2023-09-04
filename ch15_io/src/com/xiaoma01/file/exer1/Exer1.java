package com.xiaoma01.file.exer1;

import java.io.File;

/**
 * ClassName: Exer1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 14:17
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
        File file1 = new File("hello.txt");

        System.out.println(file1.getAbsolutePath());

//        System.out.println(file1.getAbsoluteFile().getParent());

        File file2 = new File(file1.getAbsoluteFile().getParent(),"abc.txt");

        System.out.println(file2.getAbsolutePath());
    }
}
