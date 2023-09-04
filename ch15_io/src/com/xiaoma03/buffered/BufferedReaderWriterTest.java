package com.xiaoma03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: BufferedReaderWriterTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 10:49
 * @Version 1.0
 */
public class BufferedReaderWriterTest {
    /*
     * ʹ��BufferedReader��dbcp_utf-8.txt�е�������ʽ�ڿ���̨�ϡ�
     * */
    @Test
    public void test1() throws IOException {
        //
        File file = new File("dbcp_utf-8.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));

        //��ȡ�Ĺ���
        //��ʽ1��read(char[] cBuffer)
//        char[] cBuffer = new char[1024];
//        int len;//��¼ÿ�ζ��뵽cBuffer�е��ַ��ĸ���
//        while((len = br.read(cBuffer)) != -1){
//           //����1��
////            for(int i = 0;i < len;i++){
////                System.out.print(cBuffer[i]);
////            }
//            //����2��
//            String str = new String(cBuffer,0,len);
//            System.out.print(str);
//
//        }

        //��ʽ2��readLine():ÿ�ζ�ȡһ���ı��е����ݡ����ص��ַ����ǲ��������з��ġ�
        String data;
        while((data = br.readLine()) != null){
            System.out.print(data + "\n");
        }

        //
        br.close();
    }

    /*
     * ʹ��BufferedReader��BufferedWriterʵ���ı��ļ��ĸ���
     *
     * ע�⣺�����У�������Ҫʹ��try-catch-finally�����������쳣��
     * */
    @Test
    public void test2() throws IOException {
        //1.���ļ�������
        File file1 = new File("dbcp_utf-8.txt");
        File file2 = new File("dbcp_utf-8_copy1.txt");

        BufferedReader br = new BufferedReader(new FileReader(file1));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file2));

        //2.�ļ��Ķ�д����
        String data ;
        while((data = br.readLine()) != null){
            bw.write(data);
            bw.newLine(); //��ʾ���в���
            bw.flush();//ˢ�µķ�����ÿ�����ô˷���ʱ���ͻ������Ľ��ڴ��е�����д���������ļ��С�
        }
        System.out.println("���Ƴɹ�");

        //3.�ر���Դ
        bw.close();
        br.close();
    }
}
