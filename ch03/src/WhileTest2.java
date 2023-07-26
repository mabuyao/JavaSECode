/**
 * ClassName: WhileTest2
 * Package: PACKAGE_NAME
 * Description:
 * 世界最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如我有一张足够大的纸，它的厚度是0.1毫米。
 * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
 * @Author Mabuyao
 * @Create 2023/7/26 15:06
 * @Version 1.0
 */
public class WhileTest2 {
    public static void main(String[] args) {

        //声明珠峰的高度、纸的默认厚度
        double paper = 0.1;//单位：mm
        double zhufeng = 8848860;//单位：mm

        //定义一个变量，记录折纸的次数
        int count = 0;

        //通过循环结构，不断调整纸的厚度
        while (paper <= zhufeng){
            paper *= 2;
            count++;
        }
        System.out.println("paper的高度为：" + (paper / 1000) + "米，超过了珠峰的高度");
        System.out.println("共折纸" + count + "次");
    }
}
