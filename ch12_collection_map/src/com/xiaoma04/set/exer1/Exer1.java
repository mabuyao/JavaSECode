package com.xiaoma04.set.exer1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * ClassName: Exer1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/28 17:46
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(34);
        list.add(34);
        list.add(34);
        list.add(22);
        list.add(22);
        list.add(22);
        list.add(15);
        list.add(45);
        list.add(45);
        list.add(45);

        System.out.println(list);
        System.out.println("*******************************");

        List newList = duplicateList(list);
        System.out.println(newList);
    }

    public static List duplicateList(List list){
        //方式1
//        HashSet set = new HashSet();
//        for(Object obj : set){
//            set.add(obj);
//        }
//
//        List list1 = new ArrayList();
//        for(Object obj : set){
//            list1.add(obj);
//        }
//
//        return list1;
        //方式2
        HashSet set = new HashSet(list);
        List list1 = new ArrayList(set);
        return list1;
    }
}
