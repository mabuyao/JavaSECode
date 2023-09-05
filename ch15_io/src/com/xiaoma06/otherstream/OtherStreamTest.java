package com.xiaoma06.otherstream;

//import org.apache.commons.io.FileUtils;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.*;

/**
 * ClassName: OtherStreamTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 10:53
 * @Version 1.0
 */
public class OtherStreamTest {
    /*
     * �Ӽ��������ַ�����Ҫ�󽫶�ȡ���������ַ���ת�ɴ�д�����
     * Ȼ������������������ֱ�������롰e�����ߡ�exit��ʱ���˳�����
     * */
    @Test
    public void test1(){
        System.out.println("��������Ϣ(�˳�����e��exit):");
        // ��"��׼"������(��������)����ֽ�����װ���ַ���,�ٰ�װ�ɻ�����
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
            while ((s = br.readLine()) != null) { // ��ȡ�û������һ������ --> ��������
                if ("e".equalsIgnoreCase(s) || "exit".equalsIgnoreCase(s)) {
                    System.out.println("��ȫ�˳�!!");
                    break;
                }
                // ����ȡ���������ַ���ת�ɴ�д���
                System.out.println("-->:" + s.toUpperCase());
                System.out.println("����������Ϣ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close(); // �رչ�����ʱ,���Զ��ر�����װ�ĵײ�ڵ���
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2() throws FileNotFoundException {
        PrintStream ps = new PrintStream("io.txt");
        ps.println("hello");
        ps.println(1);
        ps.println(1.5);

        System.setOut(ps);
        System.out.println("���,atguigu");


        ps.close();

    }

    @Test
    public void test3(){
        PrintStream ps = null;
        try {
            FileOutputStream fos = new FileOutputStream(new File("D:\\IO\\text.txt"));
            // ������ӡ�����,����Ϊ�Զ�ˢ��ģʽ(д�뻻�з����ֽ� '\n' ʱ����ˢ�����������)
            ps = new PrintStream(fos, true);
            if (ps != null) {// �ѱ�׼�����(����̨���)�ĳ��ļ�
                System.setOut(ps);
            }
            for (int i = 0; i <= 255; i++) { // ���ASCII�ַ�
                System.out.print((char) i);
                if (i % 50 == 0) { // ÿ50������һ��
                    System.out.println(); // ����
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ps != null) {
                ps.close();
            }
        }
    }

    //�����Զ������־��
    @Test
    public void test4(){
        //���Թ������Ƿ����
        Logger.log("������System���gc()����������������������");

        Logger.log("������TeamView��addMember()����");

        Logger.log("�û����Խ��е�¼����֤ʧ��");
    }

    @Test
    public void test5() throws IOException {
        //��ֵһ��ͼƬ
        File srcFile = new File("playgirl.jpg");
        File destFile = new File("playgirl_copy2.jpg");

        FileUtils.copyFile(srcFile,destFile);

        System.out.println("���Ƴɹ�");
    }
}

