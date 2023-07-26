import java.util.Scanner;

/**
 * ClassName: WhlieTest12
 * Package: PACKAGE_NAME
 * Description:
 * 随机生成一个100以内的数，猜这个随机数是多少？
 *
 * 从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。
 *
 * 提示：生成一个[a,b] 范围的随机数的方式：(int)(Math.random() * (b - a + 1) + a)
 * @Author Mabuyao
 * @Create 2023/7/26 14:57
 * @Version 1.0
 */
public class WhlieTest12 {
    public static void main(String[] args) {
        //随机生成一个100以内的数
        int random = (int)(Math.random() * 100) + 1;

        //使用scanner，从键盘获取数据
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入1-100范围的一个整数：");
        int guess = scan.nextInt();

        //声明一个变量，记录猜的次数
        int guessCount = 1;

        //使用循环结构，进行多次循环的对比和获取数据
        while (random != guess){
            if(guess > random){
                System.out.println("你输入的数偏大");
            }else{
                System.out.println("你输入的数偏小");
            }
            System.out.println("请输入1-100范围的一个整数：");
            guess = scan.nextInt();
            guessCount++;
        }

        //能结束循环，就意味着random和guess相等了
        System.out.println("恭喜你，猜对了");
        System.out.println("一共猜了" + guessCount + "次");

        scan.close();
    }
}
