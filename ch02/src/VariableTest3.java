/**
 * ClassName: VariableTest3
 * Package: PACKAGE_NAME
 * Description:测试基本数据类型变量之间的运算规则
 *
 * @Author Mabuyao
 * @Create 2023/7/20 13:43
 * @Version 1.0
 */
public class VariableTest3 {
    public static void main(String[] args) {
        //规则：当容量小的变量与容量大的变量做运算时，结果自动转换为容量大的数据类型
        //byte、short-->int-->long-->float-->double
        //特别的：byte、short、char类型之间的变量做运算，结果为int类型
        int i1 = 10;
        int i2 = i1;

        long l1 = i1;

        float f1 = l1;

        byte b1 = 12;
        int i3 = b1 + i1;

        //byte b2 = b1 + i1;  //编译不通过

        //特殊情况1
        byte b3 = 12;
        short s1 = 10;
        //short s2 = b3 + s1;  //编译不通过，byte和short相加结果为int类型
        i3 = b3 + s1;

        //特殊情况2：char
        char c1 = 'a';
        //char c2 = c1 + b3;  //编译不通过
        int i4 = c1 + b3;

        //练习
        long l2 = 123L;
        long l3 = 123;  //理解为：自动类型提升

        float f2 = 12.3F;
        //float f3 = 12.3;  //不满足自动类型提升的规则，浮点数默认为double类型

        byte b5 = 10;
        int ii1 = b5 + 1;

        double dd1 = b5 + 12.3;

        //变量名不能以数字开头的原因
        //int 123L = 12;
        //long l6 = 123L;
    }
}
