/**
 * ClassName: AriExer1
 * Package: PACKAGE_NAME
 * Description:
 *为抵抗洪水，战士连续作战89小时，编程计算共多少天零多少小时？
 * @Author Mabuyao
 * @Create 2023/7/20 17:32
 * @Version 1.0
 */
public class AriExer1 {
    public static void main(String[] args) {
        int hours = 89;

        int day = hours / 24;
        int hour = hours % 24;

        System.out.println("共奋战了" + day + "天零" + hour + "小时");

        System.out.println("5+5=" + 5 + 5); //打印结果是？ 5+5=55
        System.out.println("5+5=" + (5 + 5)); //打印结果是？ 5+5=10  与运算优先级有关

        byte bb1 = 127;
        bb1++;
        System.out.println("bb1 = " + bb1);//-128

        int i = 1;
        int j = i++ + ++i * i++;
        System.out.println("j = " + j);//10

        int i1 = 2;
        int j1 = i1++;
        System.out.println(j1);//2

        int m = 2;
        m = m++; //(1)先取b的值“2”放操作数栈 (2)m再自增,m=3 (3)再把操作数栈中的"2"赋值给m,m=2
        System.out.println(m);//2
    }
}
