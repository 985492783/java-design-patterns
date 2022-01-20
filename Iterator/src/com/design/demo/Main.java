package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/20 17:01
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf =new BookShelf(4);
        bookShelf.appendBook(new Book("Around"));
        bookShelf.appendBook(new Book("CIN"));
        bookShelf.appendBook(new Book("HelloWorld"));
        bookShelf.appendBook(new Book("ABCD"));
        Iterator<Book> it = bookShelf.getIterator();
        while(it.hasNext()){
            System.out.println(it.next().getName());
        }
    }
}
