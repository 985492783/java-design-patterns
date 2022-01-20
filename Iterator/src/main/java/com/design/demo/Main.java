package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/20 15:47
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cin"));
        bookShelf.appendBook(new Book("Daddy"));
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()){
            Book book = it.next();
            System.out.println(book.getName());
        }
    }
}
