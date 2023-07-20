/**
 * ClassName: StringTest
 * Package: PACKAGE_NAME
 * Description:基本数据类型与String的运算
 *
 * @Author Mabuyao
 * @Create 2023/7/20 14:22
 * @Version 1.0
 */
public class StringTest {
    public static void main(String[] args) {
        String str1 = "Hello,World!";
        System.out.println(str1);

        String str2 = "";
        String str3 = "a";

        //测试连接运算
        int num1 = 10;
        boolean b1 = true;
        String str4 = "hello";

        System.out.println(str4 + b1);

        String str5 = str4 + b1;
        String str6 = str4 + b1 + num1;
        System.out.println(str6);//hellotrue10

        //String str7 = b1 + num1 + str4;//编译不通过，运算符从左往右算，第一个boolean类型和int类型没法计算

        //如何将String类型的变量转换为基本数据类型
        String str8 = "abc";//不能考虑转换为基本数据类型

        int num2 = 10;
        String str9 = num2 + "";//”10“
        //int num3 = (int) str9;//编译不通过

        //如何实现？
        int num3 = Integer.parseInt(str9);
        System.out.println(num3 + 1);
    }
}
