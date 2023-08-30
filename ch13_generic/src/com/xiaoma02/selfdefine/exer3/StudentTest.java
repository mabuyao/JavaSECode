package com.xiaoma02.selfdefine.exer3;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/29 17:45
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student<String> s1 = new Student<>("Tom","良好");

        Student<Double> s2 = new Student<>("Jerry",87.5);

        Student<Character> s3 = new Student<>("Rose",'A');

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
