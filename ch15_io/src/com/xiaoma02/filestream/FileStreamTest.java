package com.xiaoma02.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileStreamTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 10:48
 * @Version 1.0
 */
public class FileStreamTest {
    /*
     * ���󣺸���һ��playgirl.jpg�ļ�������Ϊplaygirl_copy.jpg
     *
     * */
    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //1. ������ص�File��Ķ���
            File srcFile = new File("playgirl.jpg");
            File destFile = new File("playgirl_copy.jpg");

            //2. ������ص��ֽ���
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3. ���ݵĶ����д��
            byte[] buffer = new byte[1024]; //1kb
            int len;//��¼ÿ�ζ��뵽buffer���ֽڵĸ���
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("���Ƴɹ�");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. �ر���Դ
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    /*
     * ���󣺸���һ��hello.txt�ļ�������Ϊhello_copy1.txt
     *
     *  ����ʹ���ֽ���ʵ���ı��ļ��ĸ��ơ�
     * */
    @Test
    public void test2() {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //1. ������ص�File��Ķ���
            File srcFile = new File("hello.txt");
            File destFile = new File("hello_copy1.txt");

            //2. ������ص��ֽ���
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3. ���ݵĶ����д��
            byte[] buffer = new byte[5];
            int len;//��¼ÿ�ζ��뵽buffer���ֽڵĸ���
            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }
            System.out.println("���Ƴɹ�");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. �ر���Դ
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    /*
     * ���󣺶�ȡhello.txt�ļ�����������ʾ�ڿ���̨�ϡ�
     * ���ܳ������롣
     * */
    @Test
    public void test3() {
        FileInputStream fis = null;

        try {
            //1. ������ص�File��Ķ���
            File srcFile = new File("hello.txt");

            //2. ������ص��ֽ���
            fis = new FileInputStream(srcFile);

            //3. ���ݵĶ����д��
            byte[] buffer = new byte[5];
            int len;//��¼ÿ�ζ��뵽buffer���ֽڵĸ���
            while ((len = fis.read(buffer)) != -1) {
                String str = new String(buffer,0,len);
                System.out.print(str);
            }
            System.out.println("���Ƴɹ�");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. �ر���Դ
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}

