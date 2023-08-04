package com.xiaoma01._this.exer1;

/**
 * ClassName: Boy
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 16:29
 * @Version 1.0
 */
public class Boy {
    private String name;
    private int age;

    public Boy() {

    }

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void marry(Girl girl) {
        System.out.println("我想娶" + girl.getName());
    }

    public void shout() {
        if (this.age >= 22) {
            System.out.println("我终于可以结婚了！");
        } else {
            System.out.println("我只能多谈恋爱了。。。");
        }
    }
}
