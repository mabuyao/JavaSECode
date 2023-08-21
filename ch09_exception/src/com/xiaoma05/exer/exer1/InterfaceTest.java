package com.xiaoma05.exer.exer1;

/**
 * ClassName: InterfaceTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/15 16:49
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle(2.3);
        ComparableCircle c2 = new ComparableCircle(5.3);

        int compareValue = c1.compareTo(c2);
        if (compareValue > 0) {
            System.out.println("c1 bigger");
        } else if (compareValue < 0) {
            System.out.println("c2 bigger");
        } else {
            System.out.println("c1 is as big as c2");
        }
    }
}
