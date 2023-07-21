/**
 * ClassName: AriTest
 * Package: PACKAGE_NAME
 * Description:测试运算符的使用
 * 算数运算符的使用
 *
 * @Author Mabuyao
 * @Create 2023/7/20 17:16
 * @Version 1.0
 */
public class AriTest {
    public static void main(String[] args) {
        //  /
        int m1 = 12;
        int n1 = 5;
        int k1 = m1 / n1;
        System.out.println(k1);//2
        System.out.println(m1 / n1 * n1);//10

        // %
        int i1 = 12;
        int j1 = 5;
        System.out.println(i1 % j1);//2
        //开发中，经常用来判断一个数是否能整除另一个数   num1 % num2 == 0;

        int i2 = -12;
        int j2 = 5;
        System.out.println(i2 % j2);//-2

        int i3 = 12;
        int j3 = -5;
        System.out.println(i3 % j3);//2

        int i4 = -12;
        int j4 = -5;
        System.out.println(i4 % j4);//-2

        //结论，取模以后，结果与被模数的符号相同

        int a1 = 10;
        int b1 = ++a1;
        System.out.println(a1 + ", " + b1);

        int a2 = 10;
        int b2 = a2++;
        System.out.println(a2 + ", " + b2);

        //练习
        short s1 = 10;
        //s1 = s1 + 1; //报错，由此体现＋1和自增的细微区别
        s1++;
        System.out.println(s1);
    }
}
