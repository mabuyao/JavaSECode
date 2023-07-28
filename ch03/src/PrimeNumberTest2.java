/**
 * ClassName: PrimeNumberTest2
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/27 11:45
 * @Version 1.0
 */
public class PrimeNumberTest2 {
    public static void main(String[] args) {
        //获取系统当前时间
        long start = System.currentTimeMillis();
        boolean isFlag = true;

        int count = 0;

        for(int i = 2; i <= 100000; i++){//遍历100000以内的自然数

            //判定i是否是质数
            for(int j = 2; j <= Math.sqrt(i); j++){
                if(i % j == 0){
                    isFlag = false;
                    break;//新增了一个break。针对于非质数有效果
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
        System.out.println("花费" + (end - start) + "毫秒");//7287-->(break)703-->(加上Math.sqrt())7
    }
}
