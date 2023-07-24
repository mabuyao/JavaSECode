/**
 * ClassName: BitTest
 * Package: PACKAGE_NAME
 * Description:位运算符
 *
 * @Author Mabuyao
 * @Create 2023/7/24 9:25
 * @Version 1.0
 */
public class BitTest {
    public static void main(String[] args) {
        int num1 = 7;
        System.out.println("num1 << 1 : " + (num1 << 1));
        System.out.println("num1 << 2 : " + (num1 << 2));
        System.out.println("num1 << 3 : " + (num1 << 3));
        System.out.println("num1 << 28 : " + (num1 << 28)); //1879048192
        System.out.println("num1 << 29 : " + (num1 << 29)); //-536870912

        int num2 = -7;
        System.out.println("num2 << 1 : " + (num2 << 1));
        System.out.println("num2 << 2 : " + (num2 << 2));
        System.out.println("num2 << 3 : " + (num2 << 3));
    }
}
