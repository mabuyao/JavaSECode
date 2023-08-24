package com.xiaoma01.string.exer2;

import org.junit.jupiter.api.Test;

/**
 * ClassName: StringTest
 * Description:
 * 题目2：将一个字符串进行反转。将字符串中指定部分进行反转。
 * 比如"abcdefg"反转为"abfedcg"
 *
 * @Author Mabuyao
 * @Create 2023/8/23 14:04
 * @Version 1.0
 */
public class StringTest {
    @Test
    public void test1() {
        String str = "abcdefg";
        String reverse = reverse(str, 2, 5);
        System.out.println(reverse);

        String reverse1 = reverse1(str, 2, 5);
        System.out.println(reverse1);

    }

    /**
     * 方式一：将String转换为char[]，针对char[]进行反转操作，再将char[]转换为String
     *
     * @param str
     * @param startIndex
     * @param endIndex
     * @return
     */
    public String reverse(String str, int startIndex, int endIndex) {
        if (str != null) {
            char[] arr = str.toCharArray();
            for (int x = startIndex, y = endIndex; x < y; x++, y--) {
                char temp = arr[x];
                arr[x] = arr[y];
                arr[y] = temp;
            }
            return new String(arr);
        }
        return null;
    }

    /*
    方式二：使用String的拼接操作
     */
    public String reverse1(String str, int startIndex, int endIndex) {
        if (str != null) {
            // 第一部分
            String reverseStr = str.substring(0, startIndex);
            // 第二部分
            for (int i = endIndex; i >= startIndex; i--) {
                reverseStr += str.charAt(i);
            }
            // 第三部分
            reverseStr += str.substring(endIndex + 1);
            return reverseStr;
        }
        return null;
    }

    /**
     * 题目3：获取一个字符串在另一个字符串中出现的次数。
     *       比如：获取"ab"在 "abkkcadkabkebfkabkskab" 中出现的次数
     */

    /**
     * 获取subStr在str中出现的次数
     *
     * @param str
     * @param subStr
     * @return 返回subStr在str中出现的次数
     */
    public int getSubStringCount(String str, String subStr) {
        int count = 0;// 记录出现的次数

        if (str.length() >= subStr.length()) {
            int index = str.indexOf(subStr);
            while (index != -1) {
                count++;
                index = str.indexOf(subStr, index + subStr.length());
            }
        }

        return count;
    }

    @Test
    public void test2() {
        String subStr = "ab";
        String str = "abkkcadkabkebfkabkskab";

        int count = getSubStringCount(str, subStr);
        System.out.println(count);

    }
}
