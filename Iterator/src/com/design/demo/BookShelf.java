package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/20 17:04
 */
public class BookShelf implements Aggregate{
    private Book[] books;
    private int last;
    public BookShelf(int maxSize){
        this.books = new Book[maxSize];
    }
    public Book getBookAt(int index){
        return books[index];
    }
    public int getLength(){
        return last;
    }
    public void appendBook(Book book){
        this.books[last++]=book;
    }
    @Override
    public Iterator getIterator() {
        return new BookShelfIterator(this);
    }
}
