package com.xiaoma05.objectstream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: ObjectInputOutputStreamTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 10:51
 * @Version 1.0
 */
public class ObjectInputOutputStreamTest {
    /*
     * ���л����̣�ʹ��ObjectOutputStream��ʵ�֡����ڴ��е�Java���󱣴����ļ��л�ͨ�����紫���ȥ
     * */
    @Test
    public void test1() throws IOException {
        //1.
        File file = new File("object.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        //2.д�����ݼ�Ϊ���л��Ĺ���
        oos.writeUTF("��ɽ��˶ཿ��������Ӣ�۾�����");
        oos.flush();

        oos.writeObject("����������ˣ��������������");
        oos.flush();


        oos.close();
    }

    /*
     * �����л����̣�ʹ��ObjectInputSteam��ʵ�֡����ļ��е����ݻ����紫����������ݻ�ԭΪ�ڴ��е�Java����
     * */
    @Test
    public void test2() throws IOException, ClassNotFoundException {
        //1.
        File file = new File("object.txt");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));


        //2. ��ȡ�ļ��еĶ��󣨻����л��Ĺ��̣�
        String str1 = ois.readUTF();
        System.out.println(str1);

        String str2 = (String) ois.readObject();
        System.out.println(str2);

        //3.
        ois.close();
    }

    //��ʾ�Զ�����Ķ�������л��ͷ����л�����
    //���л����̣�
    @Test
    public void test3() throws IOException {
        //1.
        File file = new File("object1.dat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        //2.д�����ݼ�Ϊ���л��Ĺ���
        Person p1 = new Person("Tom",12);
        oos.writeObject(p1);
        oos.flush();

        Person p2 = new Person("Jerry",23,1001,new Account(2000));
        oos.writeObject(p2);
        oos.flush();

        //3.
        oos.close();
    }

    //�����л����̣�
    @Test
    public void test4() throws IOException, ClassNotFoundException {
        //1.
        File file = new File("object1.dat");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));


        //2. ��ȡ�ļ��еĶ��󣨻����л��Ĺ��̣�
        Person person = (Person) ois.readObject();
        System.out.println(person);


        Person person1 = (Person) ois.readObject();
        System.out.println(person1);

        //3.
        ois.close();
    }

}
