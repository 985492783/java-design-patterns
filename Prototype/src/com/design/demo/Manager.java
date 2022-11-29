package com.design.demo;

import java.util.HashMap;

/**
 * @author 98549
 * @date 2022/1/23 17:07
 */
public class Manager {
    private HashMap showcase= new HashMap();
    public void register(String s,PrototypeProduct proto){
        showcase.put(s,proto);
    }
    public PrototypeProduct create(String s){
        PrototypeProduct p = (PrototypeProduct) showcase.get(s);
        return p.createPrototypeProduct();
    }
}
