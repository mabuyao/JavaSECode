package com.xiaoma07.encapsulation.exer2;

/**
 * ClassName: BookTest
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/2 18:03
 * @Version 1.0
 */
public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book();

        book1.setBookName("剑指Java");
        book1.setAuthor("xiaoma");
        book1.setPrice(180.0);

        System.out.println(book1.showInfo());
    }
}
