/**
 * ClassName: DoWhileTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/26 15:48
 * @Version 1.0
 */
public class DoWhileTest {
    public static void main(String[] args) {
        //遍历100以内的偶数，并输出偶数的个数和总和
        int i = 1;
        int count = 0;
        int sum = 0;
        do{
            if(i % 2 == 0){
                System.out.println(i);
                count++;
                sum += i;
            }
            i++;
        }while (i <= 100);
        System.out.println("偶数的个数为：" + count);
        System.out.println("偶数的总和为：" + sum);

        int num1 = 10;
        while (num1 > 10){
            System.out.println("while:hello");
            num1--;
        }

        int num2 = 10;
        do {
            System.out.println("do-while:hello");
            num2--;
        }while (num2 > 10);
    }
}
