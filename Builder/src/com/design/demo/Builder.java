package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/24 16:58
 */
public abstract class Builder {
    public abstract void makeTitle(String title);
    public abstract void makeString(String string);
    public abstract void makeItem(String[] items);
    public abstract void close();
}
