/**
 * ClassName: WhileTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/26 14:10
 * @Version 1.0
 */
public class WhileTest {
    public static void main(String[] args) {
        //需求1：遍历50次helloworld
        int i = 1;
        while (i <= 50){
            System.out.println("HelloWorld" + i);
            i++;
        }

        //需求2：
        int j = 1;

        int count = 0;
        int sum = 0;
        while (j <= 100){
            if(j % 2 == 0){
                System.out.println(j);
                count++;
                sum += j;
            }
            j++;
        }

        System.out.println("偶数的个数为 ；" + count);
        System.out.println("偶数的总和为 ；" + sum);
    }
}
