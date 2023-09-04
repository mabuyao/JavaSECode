package com.xiaoma03.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: CopyFileTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 10:50
 * @Version 1.0
 */
public class CopyFileTest {

    @Test
    public void testSpendTime(){
        long start = System.currentTimeMillis();

        String src = "C:\\Users\\shkstart\\Desktop\\01-��Ƶ.mp4";
        String dest = "C:\\Users\\shkstart\\Desktop\\03-��Ƶ.mp4";
//        copyFileWithFileStream(src,dest); //11189

        copyFileWithBufferedStream(src,dest);//412

        long end = System.currentTimeMillis();

        System.out.println("���ѵ�ʱ��Ϊ��" + (end - start));
    }

    /*
     * ʹ��BufferedInputStream + BufferedOutputStream �����ļ�
     * */
    public void copyFileWithBufferedStream(String src, String dest) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1. ������ص�File��Ķ���
            File srcFile = new File(src);
            File destFile = new File(dest);

            //2. ������ص��ֽ�����������
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3. ���ݵĶ����д��
            byte[] buffer = new byte[50];
            int len;//��¼ÿ�ζ��뵽buffer���ֽڵĸ���
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            System.out.println("���Ƴɹ�");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. �ر���Դ
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /*
     * ʹ��FileInputStream + FileOutputStream �����ļ�
     * */
    public void copyFileWithFileStream(String src, String dest) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //1. ������ص�File��Ķ���
            File srcFile = new File(src);
            File destFile = new File(dest);

            //2. ������ص��ֽ���
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3. ���ݵĶ����д��
            byte[] buffer = new byte[50];
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
}

