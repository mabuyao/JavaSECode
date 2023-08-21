package com.xiaoma04._throw;

/**
 * ClassName: ThrowTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/18 9:52
 * @Version 1.0
 */
public class ThrowTest {
    public static void main(String[] args) {
        Student s = new Student();
        try {
            s.regist(10);
            s.regist(-10);
            System.out.println(s);
        }catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}

class Student{
    int id;

    public void regist(int id) throws Exception{
        if (id > 0){
            this.id = id;
        }else {
            // 手动抛出异常类的对象
//             throw new RuntimeException("您输入的数据非法！");
            throw new BelowZeroException("您输入的数据非法！");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
