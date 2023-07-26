/**
 * ClassName: ForTest
 * Package: PACKAGE_NAME
 * Description:
 *  for循环
 * @Author Mabuyao
 * @Create 2023/7/25 15:14
 * @Version 1.0
 */
public class ForTest {
    public static void main(String[] args) {
        //输出5行helloworld
        for(int i = 0; i < 5; i++){
            System.out.println("HelloWorld!");
        }

        //
        int num = 1;
        for(System.out.print("a");num < 3;System.out.print("c"),num++) {
            System.out.print("b");//abcbc
        }

        System.out.println();
        //遍历1-100以内的偶数，并获取偶数的个数，获取所有的偶数的和
        int count = 0;

        int sum = 0;
        for(int i = 1; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println(i);
                count++;
                sum += i;
            }
        }
        System.out.println("偶数的个数为： " + count);
        System.out.println("偶数的总和为： " + sum);
    }
}
