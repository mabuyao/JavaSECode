package com.xiaoma01.file;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: FileTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 10:45
 * @Version 1.0
 */
public class FileTest {
    /*
     * `public File(String pathname) ` ����pathnameΪ·������File���󣬿����Ǿ���·���������·�������pathname�����·������Ĭ�ϵĵ�ǰ·����ϵͳ����user.dir�д洢��
     * `public File(String parent, String child) ` ����parentΪ��·����childΪ��·������File����
     * `public File(File parent, String child)` ������һ����File��������ļ�·������File����
     *
     * �ļ���·����ʾ��ʽ��
     * ��ʽ1������·������windows����ϵͳΪ���������̷����ڵ��ļ����ļ�Ŀ¼������·����
     * ��ʽ2�����·���������ĳһ���ļ�Ŀ¼��������Ե�λ�á�
     *          ��IDEA�У����ʹ�õ�Ԫ���Է���������ڵ�ǰ��module����
     *                   ���ʹ��main()����������ڵ�ǰ��project����
     * */
    @Test
    public void test1(){
        //public File(String pathname)
        File file1 = new File("d:/io\\hello.txt");

        File file2 = new File("ab");
        System.out.println(file2.getAbsolutePath());
    }

//    public static void main(String[] args) {
//        File file2 = new File("abc");
//        System.out.println(file2.getAbsolutePath());
//    }

    @Test
    public void test2(){
        //public File(String parent, String child)
        //����1��һ����һ���ļ�Ŀ¼
        //����2��������һ���ļ���Ҳ������һ���ļ�Ŀ¼
        File file1 = new File("d:\\io","abc.txt");
        File file2 = new File("abc","a12");

        //public File(File parent, String child)
        //����1��һ����һ���ļ�Ŀ¼
        //����2��������һ���ļ���Ҳ������һ���ļ�Ŀ¼
        File file3 = new File(file2,"ab.txt");
    }
}

