package com.xiaoma03.reflectapply.apply1;

import com.xiaoma01.example.Person;
import org.junit.jupiter.api.Test;

/**
 * ClassName: NewInstanceTest
 * Description:
 * 反射的应用1：创建运行时类的对象
 * @Author Mabuyao
 * @Create 2023/9/6 15:04
 * @Version 1.0
 */
public class NewInstanceTest {
    @Test
    public void test1() throws InstantiationException, IllegalAccessException {
        Class clazz = Person.class;

        //创建Person类的实例
        Person per = (Person) clazz.newInstance();

        System.out.println(per);

    }
}
