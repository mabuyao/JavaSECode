/**
 * ClassName: VariableTest1
 * Package: PACKAGE_NAME
 * Description:测试整型和浮点型变量的使用
 *
 * @Author Mabuyao
 * @Create 2023/7/19 17:56
 * @Version 1.0
 */
public class VariableTest1 {
    public static void main(String[] args) {
        // byte / short / int / long
        byte b1 = 12;
        byte b2 = 127;
        //byte b3 = 128;  //出错超出范围

        short s1 = 1234;

        int i1 = 121233445;

        long l1 = 1223452435L;//声明long类型变量时，需要提供后缀，为L或者l

        double d1 = 12.3;

        float f1 = 12.3f;

        System.out.println("f1 = " + f1);
    }
}
