/**
 * ClassName: FloatDoubleExer1
 * Package: PACKAGE_NAME
 * Description:小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
 * 它需要一个程序将华氏温度（80度）转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度。
 * ℃ = (℉ - 32) / 1.8
 *
 * @Author Mabuyao
 * @Create 2023/7/20 9:31
 * @Version 1.0
 */
public class FloatDoubleExer1 {
    public static void main(String[] args) {
        double hua = 80;
        double she = (hua - 32) / 1.8;
        System.out.println("华氏度" + hua + "℉对应的摄氏度为" + she + "℃");
    }
}
