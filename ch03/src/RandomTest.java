/**
 * ClassName: RandomTest
 * Package: PACKAGE_NAME
 * Description:
 * 如何获取一个随机数
 * @Author Mabuyao
 * @Create 2023/7/25 11:25
 * @Version 1.0
 */
public class RandomTest {
    public static void main(String[] args) {
        double d1 = Math.random();//random会返回一个[0.0, 1.0)范围的double型随机数
        System.out.println(d1);

        int num1 = (int)(Math.random() * 101); //[0.0, 1.0) --> [0.0, 101.0) --> [0, 100]
        System.out.println(num1);

        int num2 = (int)(Math.random() * 101) + 1; //[0.0, 1.0) --> [0.0, 100.0) --> [0, 99] --> [1, 100]
        System.out.println(num2);

        //需求：需要获取一个[a, b]范围的随机整数
        //(int)(Math.random() * (b - a + 1)) + a
    }
}
