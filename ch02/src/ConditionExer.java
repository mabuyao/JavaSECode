/**
 * ClassName: ConditionExer
 * Package: PACKAGE_NAME
 * Description:
 *今天是周2，10天以后是周几？
 * 要求：控制台输出"今天是周2，10天以后是周x"。
 * @Author Mabuyao
 * @Create 2023/7/24 11:31
 * @Version 1.0
 */
public class ConditionExer {
    public static void main(String[] args) {
        int week = 2;
        week += 10;
        week %= 7;
        System.out.println("今天是周2，10天以后是周" + ((week == 0) ? "日" : week));

        week = 4;
        week += 10;
        week %= 7;
        System.out.println("今天是周4，10天以后是周" + ((week == 0) ? "日" : week));
    }
}
