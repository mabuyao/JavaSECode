/**
 * ClassName: LogicTest
 * Package: PACKAGE_NAME
 * Description:逻辑运算符
 *
 * @Author Mabuyao
 * @Create 2023/7/21 11:28
 * @Version 1.0
 */
public class LogicTest {
    public static void main(String[] args) {
        //区分：& 和 &&
        //相同点：两个符号表达的都是且的关系，同真才真

        /*
        区分“&”和“&&”:
        - 相同点：如果符号左边是true，则二者都执行符号右边的操作
        - 不同点：
        & ： 如果符号左边是false,则继续执行符号右边的操作
        && ：如果符号左边是false,则不再继续执行符号右边的操作
        - 建议：开发中，推荐使用 &&
         */

        boolean b1 = true;
        b1 = false;

        int num1 = 10;

        if(b1 & (num1++ >0)){
            System.out.println("床前明月光");
        }else {
            System.out.println("我叫郭德纲");
        }

        System.out.println("num1 = " + num1);//11

        boolean b2 = true;
        b2 = false;

        int num2 = 10;

        if(b2 && (num2++ >0)){
            System.out.println("床前明月光");
        }else {
            System.out.println("我叫郭德纲");
        }

        System.out.println("num2 = " + num2);//10
    }
}
