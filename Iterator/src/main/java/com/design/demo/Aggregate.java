package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/20 15:36
 */
public interface Aggregate {
    /**
     * 创建Iter实例
     * @return Iterator
     */
    Iterator getIterator();
}
