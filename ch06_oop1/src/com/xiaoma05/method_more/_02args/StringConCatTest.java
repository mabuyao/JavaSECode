package com.xiaoma05.method_more._02args;

/**
 * ClassName: StringConCatTest
 * Description:
 * 字符串拼接
 * @Author Mabuyao
 * @Create 2023/8/2 9:44
 * @Version 1.0
 */
public class StringConCatTest {
    public static void main(String[] args) {
        StringConCatTest test = new StringConCatTest();
        String info = test.concat("-", "hello", "world");
        System.out.println(info);

        System.out.println(test.concat("/", "hello"));

        System.out.println(test.concat("-"));
    }

    public String concat(String operator, String ... strs){
        String result = "";

        for (int i = 0; i < strs.length; i++) {
            if (i == 0){
                result += strs[i];
            }else{
                result += (operator + strs[i]);
            }
        }

        return result;
    }
}
