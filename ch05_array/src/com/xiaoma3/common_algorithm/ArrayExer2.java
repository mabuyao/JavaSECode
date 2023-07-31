package com.xiaoma3.common_algorithm;

/**
 * ClassName: ArrayExer2
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/31 9:49
 * @Version 1.0
 */
public class ArrayExer2 {
    public static void main(String[] args) {
        int[] scores = {5,4,6,8,9,0,1,2,7,3};

        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
            if(max < scores[i]){
                max = scores[i];
            }
            if(min > scores[i]){
                min = scores[i];
            }
        }

        int avg = (sum - max - min) / (scores.length - 2);
        System.out.println("去掉最高分与最低分，平均分为：" + avg);
    }
}
