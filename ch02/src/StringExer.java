/**
 * ClassName: StringExer
 * Package: PACKAGE_NAME
 * Description:公安局身份登记
 * 要求填写自己的姓名、年龄、性别、体重、婚姻状况（已婚用true表示，单身用false表示）、联系方式等等。
 *
 * @Author Mabuyao
 * @Create 2023/7/20 14:48
 * @Version 1.0
 */
public class StringExer {
    public static void main(String[] args) {
        String name = "小马";
        int age = 24;
        char gender = '男';
        double weight = 130.5;
        boolean isMarried = false;
        String phoneNumber = "18012311231";//不能参与运算

        System.out.println("name = " + name + ",age = " + age + ",gender = " + gender + ",weight = " + weight +
                ",isMarried = " + isMarried + ",phoneNumber = " + phoneNumber);
    }
}
