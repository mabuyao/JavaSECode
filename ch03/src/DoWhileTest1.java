import java.util.Scanner;

/**
 * ClassName: DoWhileTest1
 * Package: PACKAGE_NAME
 * Description:
 * 声明变量balance并初始化为0，用以表示银行账户的余额，下面通过ATM机程序实现存款，取款等功能。
 *
 * =========ATM========
 *    1、存款
 *    2、取款
 *    3、显示余额
 *    4、退出
 * 请选择(1-4)：
 * @Author Mabuyao
 * @Create 2023/7/26 15:57
 * @Version 1.0
 */
public class DoWhileTest1 {
    public static void main(String[] args) {
        //定义balance变量，记录账户余额
        double balance = 0;

        boolean flag = true;//控制循环的结束

        Scanner scan = new Scanner(System.in);//实体化scanner

        //声明ATM取款的界面
        do {
            System.out.println("=========ATM========");
            System.out.println("       1、存款       ");
            System.out.println("       2、取款       ");
            System.out.println("       3、显示余额    ");
            System.out.println("       4、退出       ");
            System.out.println("请选择(1-4)：");

            //使用scanner获取用户选择
            int selection = scan.nextInt();

            //根据用户选择，执行不同操作
            switch (selection){
                case 1:
                    System.out.println("请输入存款的金额：");
                    double moneyIn = scan.nextDouble();
                    if(moneyIn > 0){
                        balance += moneyIn;
                        System.out.println("存款成功！");
                    }
                    break;
                case 2:
                    System.out.println("请输入取款的金额：");
                    double moneyOut = scan.nextDouble();
                    if(moneyOut > 0 && moneyOut <= balance){
                        balance -= moneyOut;
                        System.out.println("取款成功！");
                    }else {
                        System.out.println("输入数据有误或余额不足");
                    }
                    break;
                case 3:
                    System.out.println("账户余额为：" + balance);
                    break;
                case 4:
                    flag = false;
                    System.out.println("感谢使用，欢迎下次光临");
                    break;
                default:
                    System.out.println("输入有误，请重新输入：");
                    break;
            }
        }while (flag);

        scan.close();
    }
}
