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

        boolean b1 = true;
        int num1 = 10;

        if(b1 & (num1++ >0)){
            System.out.println("床前明月光");
        }else {
            System.out.println("我叫郭德纲");
        }

        System.out.println("num1 = " + num1);

        boolean b2 = true;
        int num2 = 10;

        if(b1 && (num2++ >0)){
            System.out.println("床前明月光");
        }else {
            System.out.println("我叫郭德纲");
        }

        System.out.println("num2 = " + num2);
    }
}
