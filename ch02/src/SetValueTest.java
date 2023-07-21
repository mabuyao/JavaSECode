/**
 * ClassName: SetValueTest
 * Package: PACKAGE_NAME
 * Description:赋值运算符
 *
 * @Author Mabuyao
 * @Create 2023/7/21 10:04
 * @Version 1.0
 */
public class SetValueTest {
    public static void main(String[] args) {
        int i = 5;

        long l = 10;//自动类型提升

        byte b = (byte) i;//强制类型转换

        //连续赋值
        int a1 = 10;
        int b1 = 10;

        int a2;
        int b2;
        a2 = b2 = 10;
        System.out.println(a2 + ", " + b2);

        int a3 = 10, b3 = 20;
        System.out.println(a3 + ", " + b3);

        //+=
        int m1 = 10;
        m1 += 5;  //类似于m1 = m1 + 5;
        System.out.println(m1);

        byte by1 = 10;
        by1 += 5;  //by1 = by1 + 5;操作会编译报错。应该写为by1 = (byte)(by1 + 5);
        System.out.println(by1);

        int m2 = 1;
        m2 *= 0.1;//+=不会改变变量类型
        System.out.println(m2);//0

        int n1 = 10;
        n1 +=2;
        System.out.println(n1);
    }
}
