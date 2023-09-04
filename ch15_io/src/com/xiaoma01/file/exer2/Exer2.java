package com.xiaoma01.file.exer2;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ClassName: Exert
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 14:21
 * @Version 1.0
 */
public class Exer2 {
    @Test
    public void test1(){
        File dir = new File("D:\\001CuiYa\\MaBuyao\\PS\\083101");

        //方式1
//        String[] listFiles = dir.list();
//        for (String s : listFiles){
//            if(s.endsWith(".jpg")){
//                System.out.println(s);
//            }
//        }

        //方式2
        //public String[] list(FilenameFilter filter)
        String[] listFiles = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                if(name.endsWith(".jpg")){
//                    return true;
//                }else {
//                    return false;
//                }
                return name.endsWith(".jpg");
            }
        });

        for (String s : listFiles){
            System.out.println(s);
        }
    }
}
