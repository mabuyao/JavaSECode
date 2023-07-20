/**
 * ClassName: VariableTest2
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/7/20 9:36
 * @Version 1.0
 */
public class VariableTest2 {
    public static void main(String[] args) {
        //1.字符类型:char（2字节）
        char c1 = 'a';
        char c2 = '中';
        char c3 = '1';
        char c4 = '%';

        char c5 = '\u0043';//对应C
        System.out.println(c5);

        char c6 = '\n';
        char c7 = '\t';
        System.out.println("hello" + c7 + "world!");

        char c8 = 97;//表示的是ASCII码的字符
        System.out.println(c8);//a

        //2.布尔类型：boolean
        //只有两个取值：true、false
        boolean bo1 = true;
        boolean bo2 = false;

        boolean isMerried = true;
        if(isMerried){
            System.out.println("很遗憾，你不能参加单身派对了！");
        }else{
            System.out.println("可以谈谈了");
        }
    }
}
