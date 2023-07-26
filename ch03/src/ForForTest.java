/**
 * ClassName: ForForTest
 * Package: PACKAGE_NAME
 * Description:
 * 嵌套循环
 * @Author Mabuyao
 * @Create 2023/7/26 16:49
 * @Version 1.0
 */
public class ForForTest {
    public static void main(String[] args) {
        for(int i = 1; i <= 6; i++){
            System.out.print('*');
        }

        System.out.println("\n--------------------------");

        for(int j = 1; j <= 5; j++){
            for(int i = 1; i <= j; i++){
                System.out.print('*');
            }
            System.out.println();
        }

        for(int j = 1; j <= 6; j++){
            for(int i = 1; i <= 7 - j; i++){
                System.out.print('*');
            }
            System.out.println();
        }

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= 5 - i; j++){
                System.out.print("  ");
            }

            for(int k = 1;k <= i;k++){
                System.out.print("* ");
            }
            if(i != 1){
                for(int o = 2;o <= i;o++){
                    System.out.print("* ");
                }
            }

            System.out.println();
        }

        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("  ");
            }

            for(int k = 1;k <= 5 - i;k++){
                System.out.print("* ");
            }

            for(int o = 2;o <= 5 - i;o++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
