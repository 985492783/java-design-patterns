package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/20 17:05
 */
public class BookShelfIterator<T> implements Iterator{
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf){
        this.bookShelf=bookShelf;
    }
    @Override
    public boolean hasNext() {
        return index<bookShelf.getLength();
    }

    @Override
    public T next() {
        return (T)bookShelf.getBookAt(index++);
    }
}
