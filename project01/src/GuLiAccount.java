/**
 * ClassName: GuLiAccount
 * Package: PACKAGE_NAME
 * Description:
 * 小马记账软件的实现
 * @Author Mabuyao
 * @Create 2023/7/27 14:17
 * @Version 1.0
 */
public class GuLiAccount {
    public static void main(String[] args) {
        boolean flag = true;

        int balance = 10000;//初始金额

        String info = "";//收支说明初始化

        while (flag){
            System.out.println("--------------------小马记账软件----------------------\n");
            System.out.println("                   1 收 支 明 细");
            System.out.println("                   2 登 记 收 入");
            System.out.println("                   3 登 记 支 出");
            System.out.println("                   4 退      出\n");
            System.out.print("请选择（1-4）：");

            char selection = Utility.readMenuSelection();//获取用户的选项:'1' '2' '3' '4'

            switch (selection) {
                case '1' -> {
                    System.out.println("--------------------收支明细----------------------");
                    System.out.println("收支\t\t\t账户金额\t\t\t收支金额\t\t\t说   明");
                    System.out.print(info);
                    System.out.println("------------------------------------------------");
                }
                case '2' -> {
                    System.out.print("本次收入金额：");
                    int moneyIn = Utility.readNumber();
                    if (moneyIn > 0) {
                        balance += moneyIn;
                    }
                    System.out.print("本次收入说明：");
                    String addDescIn = Utility.readString();
                    info += "收入\t\t\t" + balance + "\t\t\t" + moneyIn + "\t\t\t\t" + addDescIn + "\n";
                    System.out.println("--------------------登记完成----------------------");
                }
                case '3' -> {
                    System.out.print("本次支出金额：");
                    int moneyOut = Utility.readNumber();
                    if (moneyOut > 0) {
                        balance -= moneyOut;
                    }
                    System.out.print("本次支出说明：");
                    String addDescOut = Utility.readString();
                    info += "支出\t\t\t" + balance + "\t\t\t" + moneyOut + "\t\t\t\t" + addDescOut + "\n";
                    System.out.println("--------------------登记完成----------------------");
                }
                case '4' -> {
                    System.out.println("\n确认是否退出（Y/N):");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') {
                        flag = false;
                    }
                }
                default -> {
                }
            }

        }
    }
}
