package com.xiaoma03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: BufferedStreamTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 10:49
 * @Version 1.0
 */
public class BufferedStreamTest {
    /*
     * ����ʹ��BufferedInputStream \ BufferedOutputStream����һ��ͼƬ
     *
     * ע�⣺���µĲ���Ӧ��ʹ��try-catch-finally�����쳣��
     * */
    @Test
    public void test1() throws Exception{

        //1. ������ص�File��Ķ���
        File srcFile = new File("playgirl.jpg");
        File destFile = new File("playgirl_copy1.jpg");

        //2. ������ص��ֽ�����������
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);

        BufferedInputStream bis = new BufferedInputStream(fis);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //3. ���ݵĶ����д��
        byte[] buffer = new byte[1024]; //1kb
        int len;//��¼ÿ�ζ��뵽buffer���ֽڵĸ���
        while ((len = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, len);
        }
        System.out.println("���Ƴɹ�");

        //4. �ر���Դ
        //�������Ĺر�
        //����������Ĺر�Ҳ���Զ��Ķ��ڲ�������йرղ��������Կ���ʡ���ڲ����Ĺرա�
        bos.close();
        bis.close();
        //�ڲ�����Ĺر�
//        fos.close();
//        fis.close();

    }
}
