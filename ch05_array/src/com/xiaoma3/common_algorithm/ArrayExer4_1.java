package com.xiaoma3.common_algorithm;

/**
 * ClassName: ArrayExer4_1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/31 11:20
 * @Version 1.0
 */
public class ArrayExer4_1 {
    public static void main(String[] args) {
        int[] array1,array2;
        array1 = new int[]{2,3,5,7,11,13,17,19};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println();
        array2 = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println(array1);//[I@4dd8dc3
        System.out.println(array2);//[I@6d03e736

        for (int i = 0; i < array2.length; i++) {
            if(i % 2 == 0){
                array2[i] = i;
            }
        }

        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
    }
}
