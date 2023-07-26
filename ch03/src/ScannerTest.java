import java.util.Scanner;

/**
 * ClassName: ScannerTest
 * Package: PACKAGE_NAME
 * Description:
 * 小明注册某交友网站，要求录入个人相关信息。如下：
 * 请输入你的网名、你的年龄、你的体重、你是否单身、你的性别等情况。
 * @Author Mabuyao
 * @Create 2023/7/25 10:31
 * @Version 1.0
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to Nilaiwowang!");
        System.out.println("Please enter your name: ");
        String name = scan.next();

        System.out.println("Please enter your age:");
        int age = scan.nextInt();

        System.out.println("Please enter your weight:");
        double weight = scan.nextDouble();

        System.out.println("Are u single(yes:true;no:false):");
        boolean isSingle = scan.nextBoolean();

        System.out.println("Please enter your gender(男/女):");
        char gender = scan.next().charAt(0);
        //Scanner类中没有提供获取char类型变量的方法，需要使用scan.next().charAt(0);

        System.out.println("网名 = " + name + "\n年龄：" + age + "\n体重：" + weight + "\n是否单身："
                + isSingle + "\n性别：" + gender);

        System.out.println("注册完成，欢迎继续进入体验");

        scan.close();
    }
}
