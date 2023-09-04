package com.xiaoma06.otherstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Logger
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/9/1 10:52
 * @Version 1.0
 */
public class Logger {
    /*
    ��¼��־�ķ�����
     */
    public static void log(String msg) {
        try {
            // ָ��һ����־�ļ�
            PrintStream out = new PrintStream(new FileOutputStream("log.txt", true));
            // �ı��������
            System.setOut(out);
            // ���ڵ�ǰʱ��
            Date nowTime = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = sdf.format(nowTime);

            System.out.println(strTime + ": " + msg);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
