/**
 * ClassName: IfElseTest2
 * Package: PACKAGE_NAME
 * Description:
 *if...else嵌套
 * 由键盘输入三个整数分别存入变量num1、num2、num3，对它们进行排序(使用 if-else if-else)，并且从小到大输出。
 * @Author Mabuyao
 * @Create 2023/7/24 17:20
 * @Version 1.0
 */
public class IfElseTest2 {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 21;
        int num3 = 44;

        if(num1 >= num2){
            if(num3 >= num1){
                System.out.println(num2 + " " + num1 + " " + num3);
            }else if(num3 <= num2){
                System.out.println(num3 + " " + num2 + " " + num1);
            }else{
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        }else{
            if(num3 >= num2){
                System.out.println(num1 + " " + num2 + " " + num3);
            }else if(num3 <= num1){
                System.out.println(num3 + " " + num1 + " " + num2);
            }else{
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        }
    }
}
