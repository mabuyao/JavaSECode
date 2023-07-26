/**
 * ClassName: NineNineTable
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/26 17:50
 * @Version 1.0
 */
public class NineNineTable {
    public static void main(String[] args) {
        for(int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(i + " * " + j + " = " + i * j + "\t\t");
            }
            System.out.println();
        }
    }
}
