/**
 * ClassName: CompareTest
 * Package: PACKAGE_NAME
 * Description:比较运算符
 *
 * @Author Mabuyao
 * @Create 2023/7/21 10:20
 * @Version 1.0
 */
public class CompareTest {
    public static void main(String[] args) {
        int m1 = 10;
        int m2 = 20;
        boolean compare1 = m1 > m2;
        System.out.println(compare1);

        int n1 = 10;
        int n2 = 20;
        System.out.println(n1 == n2);//false
        System.out.println(n1 = n2);//20

        boolean b1 = false;
        boolean b2 = true;
        System.out.println(b1 == b2);//false
        System.out.println(b1 = b2);//true
    }
}
