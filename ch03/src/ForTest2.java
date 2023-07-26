/**
 * ClassName: ForTest2
 * Package: PACKAGE_NAME
 * Description:
 * 说明：输入两个正整数m和n，求其最大公约数和最小公倍数。
 *
 * 比如：12和20的最大公约数是4，最小公倍数是60。
 * @Author Mabuyao
 * @Create 2023/7/26 13:54
 * @Version 1.0
 */
public class ForTest2 {
    public static void main(String[] args) {
        int m = 12;
        int n = 20;

        int min = (m < n)? m : n;

        //最大公约数
        /*
        //方式1：
        int result = 1;
        for(int i = 1; i <= min; i++){
            if(m % i == 0 && n % i == 0){
                //System.out.println(i);
                result = i;
            }
        }

        System.out.println(result);
        */

        //方式2: 推荐
        for(int i = min; i >= 1; i--){
            if(m % i == 0 && n % i == 0){
                System.out.println(i);
                break;
            }
        }


        //最小公倍数
        int max = (m > n)? m : n;

        for(int i = max; i <= m * n; i++){
            if(i % m == 0 && i % n == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
