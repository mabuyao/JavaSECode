/**
 * ClassName: ConditionTest
 * Package: PACKAGE_NAME
 * Description:条件运算符
 *
 * @Author Mabuyao
 * @Create 2023/7/24 11:22
 * @Version 1.0
 */
public class ConditionTest {
    public static void main(String[] args) {
        String info = (2 > 1)? "sentence1" : "sentence2";
        System.out.println(info);

        double result = (2 > 1)? 1 : 2.0;
        System.out.println(result);

        //练习1：获取两个整数的较大值
        int m = 10;
        int n = 20;

        int max = (m > n)? m : n;
        System.out.println("较大值为：" + max);

        //练习2：获取三个整数的最大值
        int i = 20;
        int j = 30;
        int k = 23;

        int tempMax = (i > j) ? i : j;
        int finalMax = (tempMax > k) ? tempMax : k;
        System.out.println(finalMax);//写成一行可读性太差
    }
}
