/**
 * ClassName: VariableTest4
 * Package: PACKAGE_NAME
 * Description:测试强制类型转换
 *
 * @Author Mabuyao
 * @Create 2023/7/20 14:08
 * @Version 1.0
 */
public class VariableTest4 {
    public static void main(String[] args) {
        double d1 = 12;//自动类型提升

        //int i1 = d1;//编译失败

        int i2 = (int)d1;
        System.out.println(i2);

        long l1 = 123L;
        //short s1 = l1;
        short s2 = (short) l1;
        System.out.println(s2);

        int i3 = 12;
        float f1 = i3;
        System.out.println(f1);//12.0

        float f2 = (float) i3;//编译可以通过，只不过可以省略（）而已

        //损失精度
        double d2 = 12.3;
        int i4 = (int) d2;
        System.out.println(i4);

        int i5 = 128;
        byte b1 = (byte) i5;
        System.out.println(b1);

        //实际开发举例：
        byte b2 = 12;
        method(b2);

        long l2 = 12L;
        //method(l2);//不通过
        method((int)12);
    }
    public static void method(int num){
        System.out.println("num = " + num);
    }
}
