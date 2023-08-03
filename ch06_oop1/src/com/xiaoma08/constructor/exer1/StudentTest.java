package com.xiaoma08.constructor.exer1;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 10:34
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student("xiaoma",22,"电子科技大学","信通");
        System.out.println(s1.getInfo());//name = xiaoma, age = 22, school = 电子科技大学, major = 信通

        Student s2 = new Student("xiaoliu",20,"西北工业大学");
        System.out.println(s2.getInfo());//name = xiaoliu, age = 20, school = 西北工业大学, major = null
    }
}
