/**
 * ClassName: PrimeNumberTest
 * Package: PACKAGE_NAME
 * Description:
 * 找出100以内所有的素数（质数）？100000以内呢？
 * 质数：只能被1和它本身整除的自然数。比如：2 3 5 7 11 13...
 * @Author Mabuyao
 * @Create 2023/7/27 11:26
 * @Version 1.0
 */
public class PrimeNumberTest {
    public static void main(String[] args) {

        //方式1：
        for(int i = 2; i <= 100; i++){//遍历100以内的自然数

            int number = 0;//记录i的约数的个数

            //判定i是否是质数
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    number++;
                }
            }

            if(number == 0){
                System.out.println(i);
            }
        }

        //方式2：
        boolean isFlag = true;
        for(int i = 2; i <= 100; i++){//遍历100以内的自然数

            //判定i是否是质数
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isFlag = false;
                }
            }

            if(isFlag){
                System.out.println(i);
            }

            isFlag = true;//重置isFlag
        }
    }
}
