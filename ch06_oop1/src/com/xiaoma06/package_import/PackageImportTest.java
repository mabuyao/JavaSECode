package com.xiaoma06.package_import;

import com.xiaoma05.method_more._04recursion.exer2.RecusionExer2;

import java.util.*;

import static java.lang.System.out;

/**
 * ClassName: PackageImportTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/2 15:40
 * @Version 1.0
 */
public class PackageImportTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList list = new ArrayList();

        HashMap map = new HashMap();

        HashSet set = new HashSet();

        Person person = new Person();

        //Field field = new Field();

        RecusionExer2 exer = new RecusionExer2();

        Date date = new Date();//Date可以使用import的方式指明

        java.sql.Date date1 = new java.sql.Date(121231231L);//使用全类名的方式

        out.println("hello");
    }
}
