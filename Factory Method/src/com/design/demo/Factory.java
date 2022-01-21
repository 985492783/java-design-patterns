package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/21 16:54
 */
public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        register(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void register(Product p);
}
