package com.xiaoma04.inputstreamreader;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: InputStreamReaderTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 10:51
 * @Version 1.0
 */
public class InputStreamReaderTest {

    @Test
    public void test1() throws IOException {
        //����File����
        File file1 = new File("dbcp_utf-8.txt");

        //����������
        FileInputStream fis = new FileInputStream(file1);
//        InputStreamReader isr = new InputStreamReader(fis);//��ʱʹ�õ���IDEAĬ�ϵ�UTF-8���ַ���
        InputStreamReader isr1 = new InputStreamReader(fis,"utf-8");//��ʽ��ʹ��UTF-8���ַ���

        //�������
        char[] cBuffer = new char[1024];
        int len;
        while((len = isr1.read(cBuffer)) != -1){
            String str = new String(cBuffer,0,len);
            System.out.print(str);
        }

        //�ر���Դ
        isr1.close();

    }

    /*
     * ��ȡ�������ݳ��������롣
     * ��Ϊdbcp_utf-8.txt�ļ�ʹ�õ���utf-8���ַ������еı��룬�����ڶ�ȡ���ļ�ʱʹ�õĽ��뼯����Ҳ��utf-8��
     * �����������룡
     * */
    @Test
    public void test2() throws IOException {
        //����File����
        File file1 = new File("dbcp_utf-8.txt");

        //����������
        FileInputStream fis = new FileInputStream(file1);
        InputStreamReader isr1 = new InputStreamReader(fis,"gbk");//��ʽ��ʹ��gbk���ַ���

        //�������
        char[] cBuffer = new char[1024];
        int len;
        while((len = isr1.read(cBuffer)) != -1){
            String str = new String(cBuffer,0,len);
            System.out.print(str);
        }

        //�ر���Դ
        isr1.close();

    }

    @Test
    public void test3() throws IOException {
        //����File����
        File file1 = new File("dbcp_gbk.txt");

        //����������
        FileInputStream fis = new FileInputStream(file1);
        InputStreamReader isr1 = new InputStreamReader(fis,"gbk");//��ʽ��ʹ��gbk���ַ���

        //�������
        char[] cBuffer = new char[1024];
        int len;
        while((len = isr1.read(cBuffer)) != -1){
            String str = new String(cBuffer,0,len);
            System.out.print(str);
        }

        //�ر���Դ
        isr1.close();

    }

    /*
     * ���󣺽�gbk��ʽ���ļ�ת��Ϊutf-8��ʽ���ļ��洢��
     * */
    @Test
    public void test4() throws IOException {
        //1. ���ļ�
        File file1 = new File("dbcp_gbk.txt");
        File file2 = new File("dbcp_gbk_to_utf8.txt");

        //2. ����
        FileInputStream fis = new FileInputStream(file1);
        //����2��Ӧ���ǽ��뼯��������dbcp_gbk.txt�ı��뼯һ�¡�
        InputStreamReader isr = new InputStreamReader(fis,"GBK");


        FileOutputStream fos = new FileOutputStream(file2);
        //����2ָ���ڴ��е��ַ��洢���ļ��е��ֽڹ�����ʹ�õı��뼯��
        OutputStreamWriter osw = new OutputStreamWriter(fos,"utf8");

        //3. ��д����
        char[] cBuffer = new char[1024];
        int len;
        while((len = isr.read(cBuffer)) != -1){
            osw.write(cBuffer,0,len);
        }

        System.out.println("�������");

        //4. �ر���Դ
        osw.close();
        isr.close();


    }
}
