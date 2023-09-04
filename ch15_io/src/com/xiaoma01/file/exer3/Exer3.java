package com.xiaoma01.file.exer3;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: Exer3
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 14:29
 * @Version 1.0
 */
public class Exer3 {
    //public void printFileName(File file)  //file可能是文件，也可能是文件目录
    @Test
    public void test1() {
        File file = new File("D:\\001CuiYa\\MaBuyao\\PS");
        printFileName(file);

    }

    public void printFileName(File file) {
        if (file.isFile()) {
            System.out.println(file.getName());
        } else if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                printFileName(f);
            }
        }
    }
}
