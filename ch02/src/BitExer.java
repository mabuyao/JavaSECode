/**
 * ClassName: BitExer
 * Package: PACKAGE_NAME
 * Description:
 *如何交换两个int型变量的值？String呢？
 * @Author Mabuyao
 * @Create 2023/7/24 9:53
 * @Version 1.0
 */
public class BitExer {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;

        System.out.println("m = " + m + ", n = " + n);

        //交换两个变量的值
        //方式1: 声明一个临时变量
        int temp = m;
        m = n;
        n = temp;

        /*
        m = m + n;//30 = 10 + 20;
        n = m - n;//10 = 30 - 20;
        m = m - n;//20 = 30 - 10;
         */
        //方式2: 使用位运算符操作
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;

        System.out.println("m = " + m + ", n = " + n);
    }
}
