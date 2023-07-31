package com.xiaoma3.common_algorithm;

/**
 * ClassName: ArrayExer5
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/31 11:31
 * @Version 1.0
 */
public class ArrayExer5 {
    public static void main(String[] args) {
        int[] arr = new int[]{34,54,3,2,65,7,34,5,76,34,67};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        //方式1
        /*
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        */

        //方式2:不推荐
        /*
        int[] newArr = new int[arr.length];
        for(int i = arr.length - 1;i >= 0; i--){
            newArr[arr.length - 1 -i] = arr[i];
        }

        arr = newArr;

         */

        //方式3
        for(int i = 0, j = arr.length - 1; i < j; i++, j--){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
