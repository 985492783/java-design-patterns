package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/21 16:57
 */
public class IDCard extends Product{
    private String owner;
    public IDCard(String owner){
        System.out.println("制作"+owner+"的卡");
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("使用"+owner+"的卡");
    }
    public String getOwner(){
        return owner;
    }
}
