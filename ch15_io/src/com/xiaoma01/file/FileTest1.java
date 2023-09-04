package com.xiaoma01.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: FileTest1
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 10:45
 * @Version 1.0
 */
public class FileTest1 {
    /*
    ��ȡ�ļ���Ŀ¼������Ϣ
    * public String getName() ����ȡ����
    * public String getPath() ����ȡ·��
    * `public String getAbsolutePath()`����ȡ����·��
    * public File getAbsoluteFile()����ȡ����·����ʾ���ļ�������
    * `public String getParent()`����ȡ�ϲ��ļ�Ŀ¼·�������ޣ�����null
    * public long length() ����ȡ�ļ����ȣ������ֽ����������ܻ�ȡĿ¼�ĳ��ȡ�
    * public long lastModified() ����ȡ���һ�ε��޸�ʱ�䣬����ֵ
    * */
    @Test
    public void test1() {
        File file1 = new File("hello.txt");
        System.out.println(file1.getName());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getParent());
        System.out.println(file1.getAbsoluteFile().getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
    }

    @Test
    public void test2() {
        File file1 = new File("D:\\io\\io1");
        System.out.println(file1.getName());
        System.out.println(file1.getPath());
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getParent());
        System.out.println(file1.getAbsoluteFile().getParent());
        System.out.println(file1.length());
        System.out.println(file1.lastModified());
    }

    /*
     �г�Ŀ¼����һ��
     * public String[] list() ������һ��String���飬��ʾ��FileĿ¼�е��������ļ���Ŀ¼��
     * public File[] listFiles() ������һ��File���飬��ʾ��FileĿ¼�е����е����ļ���Ŀ¼��
     * */
    @Test
    public void test3() {
        //public String[] list()
        File file1 = new File("E:\\BaiduNetdiskDownload\\00�й��Java���Ž̳̣�java������+Java�������⣨2023�°棩\\01_�μ�����ӽ̲�\\01_�μ�����ӽ̲�\\01_�μ�����ӽ̲�");
        String[] fileArr = file1.list();
        for (String s : fileArr) {
            System.out.println(s);
        }

        System.out.println();
        //public File[] listFiles()
        File[] files = file1.listFiles();
        for (File f : files) {
            System.out.println(f);
//            System.out.println(f.getName());
        }
    }

    /*
    File�������������
    - public boolean renameTo(File dest):���ļ�������Ϊָ�����ļ�·����

    ������
    file1.renameTo(file2):Ҫ��˷���ִ���꣬����true��Ҫ��
       file1������ڣ���file2���벻���ڣ���file2���ڵ��ļ�Ŀ¼��Ҫ���ڡ�
    * */
    @Test
    public void test4() {
        File file1 = new File("hello.txt");

        File file2 = new File("d:\\io\\abc.txt");

        boolean renameSuccess = file1.renameTo(file2);
        System.out.println(renameSuccess ? "�������ɹ�" : "������ʧ��");
    }

    /*
    �жϹ��ܵķ���
    - `public boolean exists()` ����File��ʾ���ļ���Ŀ¼�Ƿ�ʵ�ʴ��ڡ�
    - `public boolean isDirectory()` ����File��ʾ���Ƿ�ΪĿ¼��
    - `public boolean isFile()` ����File��ʾ���Ƿ�Ϊ�ļ���
    - public boolean canRead() ���ж��Ƿ�ɶ�
    - public boolean canWrite() ���ж��Ƿ��д
    - public boolean isHidden() ���ж��Ƿ�����
    * */
    @Test
    public void test5() {
        File file1 = new File("d:\\io\\abc.txt");
        System.out.println(file1.exists());
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());

        System.out.println();
        File file2 = new File("d:\\ioo");
        System.out.println(file2.exists());
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());
        System.out.println(file2.canRead());
        System.out.println(file2.canWrite());
        System.out.println(file2.isHidden());

    }

    /*
    ������ɾ������
    - `public boolean createNewFile()` �������ļ������ļ����ڣ��򲻴���������false��
    - `public boolean mkdir()` �������ļ�Ŀ¼��������ļ�Ŀ¼���ڣ��Ͳ������ˡ�������ļ�Ŀ¼���ϲ�Ŀ¼�����ڣ�Ҳ��������
    - `public boolean mkdirs()` �������ļ�Ŀ¼������ϲ��ļ�Ŀ¼�����ڣ�һ��������
    - `public boolean delete()` ��ɾ���ļ������ļ���
      ɾ��ע������� Java�е�ɾ�����߻���վ���� Ҫɾ��һ���ļ�Ŀ¼����ע����ļ�Ŀ¼�ڲ��ܰ����ļ������ļ�Ŀ¼��
    * */

    @Test
    public void test6() throws IOException {
        File file1 = new File("d:\\io\\hello.txt");
        //�����ļ��Ĵ�����ɾ��
        if (!file1.exists()) {
            boolean isSuccessed = file1.createNewFile();
            if (isSuccessed) {
                System.out.println("�����ɹ�");
            }
        } else {
            System.out.println("���ļ��Ѵ���");


            System.out.println(file1.delete() ? "�ļ�ɾ���ɹ�" : "�ļ�ɾ��ʧ��");
        }
    }

    @Test
    public void test7(){
        //ǰ�᣺d:\\io�ļ�Ŀ¼���ڣ�io2��io3Ŀ¼�ǲ����ڵġ�
        File file1 = new File("d:\\io\\io2");

        System.out.println(file1.mkdir());//true

        File file2 = new File("d:\\io\\io3");

        System.out.println(file2.mkdirs()); //true
    }

    @Test
    public void test8(){
        //ǰ�᣺d:\\io�ļ�Ŀ¼���ڣ�io2��io3Ŀ¼�ǲ����ڵġ�
        File file1 = new File("d:\\io\\io2\\io4");

        System.out.println(file1.mkdir());//false

        File file2 = new File("d:\\io\\io3\\io5");

        System.out.println(file2.mkdirs()); //true
    }

    @Test
    public void test9(){
        File file1 = new File("d:\\io\\io3");

        System.out.println(file1.delete());
    }

}

