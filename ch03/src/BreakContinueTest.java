/**
 * ClassName: BreakContinueTest
 * Package: PACKAGE_NAME
 * Description:
 * break和continue
 * @Author Mabuyao
 * @Create 2023/7/26 17:59
 * @Version 1.0
 */
public class BreakContinueTest {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            if(i % 4 == 0){
                //break;//1 2 3
                continue;//1 2 3 5 6 7 9 10
            }
            System.out.print(i + " ");
        }

        System.out.println("\n****************************************");

        for(int j = 1; j <= 4; j++){
            for(int i = 1; i <= 10; i++){
                if(i % 4 == 0){
                    //break;//1 2 3
                    continue;//1 2 3 5 6 7 9 10
                }
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println("\n****************************************");

        label:for(int j = 1; j <= 4; j++){
            for(int i = 1; i <= 10; i++){
                if(i % 4 == 0){
                    break label;//1 2 3
                    //continue label;//1 2 3 1 2 3 1 2 3 1 2 3
                }
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
