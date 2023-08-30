package com.xiaoma01.use.exer2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * ClassName: Exer2
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/29 15:52
 * @Version 1.0
 */
public class Exer2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int random = (int) (Math.random() * (99 - 0 + 1));
            list.add(random);
        }

        for (Integer value : list) {
            System.out.println(value);
        }

        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer value) {
                return value % 2 == 0;
            }
        });

        System.out.println();

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
