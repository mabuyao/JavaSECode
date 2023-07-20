/**
 * ClassName: VariableTest
 * Package: PACKAGE_NAME
 * Description:测试变量的基本使用
 *
 * @Author Mabuyao
 * @Create 2023/7/19 15:06
 * @Version 1.0
 */
public class VariableTest {
    public static void main(String[] args) {
        int age = 10;

        char gender;//变量的声明
        gender = '男';//变量的赋值（初始化）

        System.out.println(age);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);

        byte b1 = 127;//不能为128（超出了byte变量的范围）
    }
    public static void main1(String[] args){
        char gender = '女';
        System.out.println("gender = " + gender);
    }
}
