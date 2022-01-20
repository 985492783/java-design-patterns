package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/20 15:38
 */
public class BookShelfIterator<T> implements Iterator<T>{
    private BookShelf bookShelf;
    private int index;
    public  BookShelfIterator(BookShelf bookShelf){
        this.bookShelf = bookShelf;
    }
    @Override
    public boolean hasNext() {
        return index < bookShelf.getLength();
    }

    @Override
    public T next() {
        return (T)bookShelf.getBookAt(index++);
    }
}
