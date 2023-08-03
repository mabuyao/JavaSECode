package com.xiaoma07.encapsulation.exer2;

/**
 * ClassName: Book
 * Description:
 *
 * @Author Mabuyao
 * @Create 2023/8/2 17:43
 * @Version 1.0
 */
public class Book {
    private String bookName;
    private String author;
    private double price;

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setBookName(String bn) {
        bookName = bn;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setPrice(double p) {
        price = p;
    }

    public String showInfo() {
        return "bookName: " + bookName + ", author: " + author + ", price: " + price;
    }
}
