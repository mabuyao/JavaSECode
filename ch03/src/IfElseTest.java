/**
 * ClassName: IfElseTest
 * Package: PACKAGE_NAME
 * Description:
 *if-else条件判断结构
 * @Author Mabuyao
 * @Create 2023/7/24 14:17
 * @Version 1.0
 */
public class IfElseTest {
    public static void main(String[] args) {
        /*
        成年人心率的正常范围是每分钟60-100次。体检时，如果心率不在此范围内，则提示需要做进一步的检查。
         */
        int heartBeats = 89;
        if(heartBeats < 60 || heartBeats > 100){
            System.out.println("你需要做进一步的检查");
        }

        System.out.println("体检结束");

        /*
        定义一个整数，判定是偶数还是奇数
         */

        int num = 13;
        if(num % 2 == 0){
            System.out.println(num + "是偶数");
        }else{
            System.out.println(num + "是奇数");
        }
    }
}
