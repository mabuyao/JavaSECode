/**
 * ClassName: PrimeNumberTest1
 * Package: PACKAGE_NAME
 * Description:
 * 找出100000以内所有的素数（质数）？
 * @Author Mabuyao
 * @Create 2023/7/27 11:39
 * @Version 1.0
 */
public class PrimeNumberTest1 {
    public static void main(String[] args) {

        //获取系统当前时间
        long start = System.currentTimeMillis();
        boolean isFlag = true;

        int count = 0;

        for(int i = 2; i <= 100000; i++){//遍历100000以内的自然数

            //判定i是否是质数
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    isFlag = false;
                }
            }

            if(isFlag){
                count++;
            }

            isFlag = true;//重置isFlag
        }

        //获取系统当前时间
        long end = System.currentTimeMillis();

        System.out.println("共有" + count + "个质数");//9592
        System.out.println("花费" + (end - start) + "毫秒");//7287
    }
}
