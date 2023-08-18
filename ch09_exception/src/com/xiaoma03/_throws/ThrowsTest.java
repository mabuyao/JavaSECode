package com.xiaoma03._throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName: ThrowsTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/17 17:06
 * @Version 1.0
 */
public class ThrowsTest {
    public static void main(String[] args) {
        method3();
    }
    public static void method3(){
        try {
            method2();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void method2() throws FileNotFoundException, IOException{
        method1();
    }
    public static void method1() throws FileNotFoundException, IOException {
        File file = new File("hello.txt");
        FileInputStream fis = new FileInputStream("hello.txt");
        int data = fis.read();
        while (data != -1) {
            System.out.println((char) data);
            data = fis.read();
        }
        fis.close();
    }
}
