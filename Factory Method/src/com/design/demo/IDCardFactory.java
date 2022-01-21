package com.design.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 98549
 * @date 2022/1/21 16:59
 */
public class IDCardFactory extends Factory{
    private List owners=new ArrayList();
    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void register(Product p) {
        owners.add(((IDCard)p).getOwner());
    }
    public List getOwners(){
        return owners;
    }
}
