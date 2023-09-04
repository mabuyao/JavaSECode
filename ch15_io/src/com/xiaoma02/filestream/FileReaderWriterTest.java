package com.xiaoma02.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ClassName: FileReaderWriterTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 10:47
 * @Version 1.0
 */
public class FileReaderWriterTest {
    /*
     * ���󣺶�ȡhello.txt�е����ݣ���ʾ�ڿ���̨�ϡ�
     *
     * �쳣ʹ��throws�ķ�ʽ������̫���ʡ��� test2()
     * */
    @Test
    public void test1() throws IOException {
        //1.����File��Ķ��󣬶�Ӧ��hello.txt�ļ�
        File file = new File("hello.txt");

        //2.���������͵��ַ��������ڶ�ȡ����
        FileReader fr = new FileReader(file);

        //3.��ȡ���ݣ�����ʾ�ڿ���̨��
        //��ʽ1��
//        int data = fr.read();
//        while(data != -1){
//            System.out.print((char)data);
//            data = fr.read();
//        }

        //��ʽ2��
        int data;
        while ((data = fr.read()) != -1) {
            System.out.print((char) data);
        }
        //4. ����Դ�Ĺرղ���������Ҫ�رգ�������ڴ�й©��
        fr.close();
    }

    /*
     * ���󣺶�ȡhello.txt�е����ݣ���ʾ�ڿ���̨�ϡ�
     * ʹ��try-catch-finally�ķ�ʽ�����쳣��ȷ����һ�����Թرգ������ڴ�й©
     * */
    @Test
    public void test2() {
        FileReader fr = null;
        try {
            //1.����File��Ķ��󣬶�Ӧ��hello.txt�ļ�
            File file = new File("hello.txt");

            //2.���������͵��ַ��������ڶ�ȡ����
            fr = new FileReader(file);

            //3.��ȡ���ݣ�����ʾ�ڿ���̨��
            int data;
            while ((data = fr.read()) != -1) {
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. ����Դ�Ĺرղ���������Ҫ�رգ�������ڴ�й©��
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * ���󣺶�ȡhello.txt�е����ݣ���ʾ�ڿ���̨�ϡ�
     *
     * ��test2()�����Ż���ÿ�ζ�ȡ����ַ���ŵ��ַ������У�����������̽����Ĵ���������Ч�ʡ�
     *
     * */
    @Test
    public void test3() {
        FileReader fr = null;
        try {
            //1.����File��Ķ��󣬶�Ӧ��hello.txt�ļ�
            File file = new File("hello.txt");

            //2.���������͵��ַ��������ڶ�ȡ����
            fr = new FileReader(file);

            //3.��ȡ���ݣ�����ʾ�ڿ���̨��
            char[] cbuffer = new char[5];
            int len;
            while ((len = fr.read(cbuffer)) != -1) {
                //��������:�����д��
//                for (int i = 0; i < cbuffer.length; i++) {
//                    System.out.print(cbuffer[i]);
//                }

                //��������:��ȷ��д��
                for (int i = 0; i < len; i++) {
                    System.out.print(cbuffer[i]);
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. ����Դ�Ĺرղ���������Ҫ�رգ�������ڴ�й©��
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * ���󣺽��ڴ��е�����д����ָ�����ļ���
     * */
    @Test
    public void test4() {
        FileWriter fw = null;
        try {
            //1. ����File��Ķ���ָ��Ҫд�����ļ�������
            File file = new File("info.txt");

            //2. ���������
            //�����ļ���ʹ�õĹ�������
            fw = new FileWriter(file);
//            fw = new FileWriter(file,false);
            //�����е��ļ������ϣ�׷������ʹ�õĹ�������
//            fw = new FileWriter(file,true);

            //3. д���ľ������
            //����ķ�����write(String str) / write(char[] cdata)
            fw.write("I love U!\n");
            fw.write("You love him!\n");
            fw.write("̫����...");

            System.out.println("����ɹ�");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. �ر���Դ
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * ���󣺸���һ��hello.txt�ļ�������Ϊhello_copy.txt
     * */
    @Test
    public void test5() {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            //1. ����File��Ķ���
            File srcFile = new File("hello.txt");
            File destFile = new File("hello_copy.txt");

            //2. �����������������
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3. ���ݵĶ����д���Ĺ���
            char[] cbuffer = new char[5];
            int len;//��¼ÿ�ζ��뵽cbuffer�е��ַ��ĸ���
            while ((len = fr.read(cbuffer)) != -1) {
                //write(char[] cbuffer,int fromIndex,int len)
                fw.write(cbuffer, 0, len); //��ȷ��
//                fw.write(cbuffer); //�����
            }

            System.out.println("���Ƴɹ�");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. �ر�����Դ
            //��ʽ1��
//            try {
            //if (fw != null)
//                  fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally {
//
//                try {
            //if (fr != null)
//                    fr.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            //��ʽ2��
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    /*
     * ���󣺸���һ��playgirl.jpg�ļ�������Ϊplaygirl_copy.jpg
     *
     * ����ʧ�ܣ���Ϊ�ַ������ʺ�����������ı��ļ���
     * */
    @Test
    public void test6() {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            //1. ����File��Ķ���
            File srcFile = new File("playgirl.jpg");
            File destFile = new File("playgirl_copy.jpg");

            //2. �����������������
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3. ���ݵĶ����д���Ĺ���
            char[] cbuffer = new char[5];
            int len;//��¼ÿ�ζ��뵽cbuffer�е��ַ��ĸ���
            while ((len = fr.read(cbuffer)) != -1) {
                //write(char[] cbuffer,int fromIndex,int len)
                fw.write(cbuffer, 0, len); //��ȷ��
//                fw.write(cbuffer); //�����
            }

            System.out.println("���Ƴɹ�");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. �ر�����Դ
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
