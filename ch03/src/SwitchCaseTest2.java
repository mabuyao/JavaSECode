import java.util.Scanner;

/**
 * ClassName: SwitchCaseTest2
 * Package: PACKAGE_NAME
 * Description:
 * 编写程序：从键盘上输入2023年的“month”和“day”，要求通过程序输出输入的日期为2023年的第几天。
 * @Author Mabuyao
 * @Create 2023/7/25 14:32
 * @Version 1.0
 */
public class SwitchCaseTest2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入2023年的月份： ");
        int month = input.nextInt();

        System.out.println("请输入2023年的天： ");
        int day = input.nextInt();

        int sumDays = 0;//记录总天数
        switch (month){
            case 12:
                sumDays += 30;
            case 11:
                sumDays += 31;
            case 10:
                sumDays += 30;
            case 9:
                sumDays += 31;
            case 8:
                sumDays += 31;
            case 7:
                sumDays += 30;
            case 6:
                sumDays += 31;
            case 5:
                sumDays += 30;
            case 4:
                sumDays += 31;
            case 3:
                sumDays += 28;
            case 2:
                sumDays += 31;
            case 1:
                sumDays += day;
                break;
        }

        System.out.println("2023年" + month + "月" + day + "日是当年的第" + sumDays + "天!");

        input.close();//为了防止内存泄漏
    }
}
