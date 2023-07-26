/**
 * ClassName: SwitchCaseTest
 * Package: PACKAGE_NAME
 * Description:
 * switch-case选择结构
 * @Author Mabuyao
 * @Create 2023/7/25 11:36
 * @Version 1.0
 */
public class SwitchCaseTest {
    public static void main(String[] args) {
        int num = 1;
        switch (num){
            case 0 :
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:
                System.out.println("other");
                break;
        }

        String season = "summer";
        switch (season) {
            case "spring":
                System.out.println("春暖花开");
                break;
            case "summer":
                System.out.println("夏日炎炎");
                break;
            case "autumn":
                System.out.println("秋高气爽");
                break;
            case "winter":
                System.out.println("冬雪皑皑");
                break;
            default:
                System.out.println("季节输入有误");
                break;
        }
    }
}
