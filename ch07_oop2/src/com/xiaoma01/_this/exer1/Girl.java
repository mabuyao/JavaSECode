package com.xiaoma01._this.exer1;

/**
 * ClassName: Girl
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/3 16:31
 * @Version 1.0
 */
public class Girl {
    private String name;
    private int age;

    public Girl() {
    }

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void marry(Boy boy) {
        System.out.println("我想嫁给" + boy.getName());

        boy.marry(this);
    }

    /**
     * 比较两个Girl对象的大小
     *
     * @param girl
     * @return 正数：当前对象大；负数：当前对象小（或形参girl大）；0：相等
     */
    public int compare(Girl girl) {
        if (this.age > girl.age) {
            return 1;
        } else if (this.age < girl.age) {
            return -1;
        } else {
            return 0;
        }
    }
}
