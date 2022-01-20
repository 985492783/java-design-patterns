package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/20 15:38
 */
public class BookShelf {
    private Book[] books;
    private int last = 0 ;
    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }
    public Book getBookAt(int index){
        return books[index];
    }
    public void appendBook(Book book){
        this.books[this.last++]=book;
    }
    public int getLength () {
        return last;
    }
    public Iterator iterator(){
        return new BookShelfIterator<Book>(this);
    }
}
