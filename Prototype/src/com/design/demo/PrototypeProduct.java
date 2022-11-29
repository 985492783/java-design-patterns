package com.design.demo;


/**
 * @author 98549
 * @date 2022/1/23 17:05
 */
public interface PrototypeProduct extends Cloneable {
    public abstract void use(String s);
    public abstract PrototypeProduct createPrototypeProduct();

}
