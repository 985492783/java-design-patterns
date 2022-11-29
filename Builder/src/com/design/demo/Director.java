package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/24 17:02
 */
public class Director {
    private Builder builder;
    public Director(Builder builder){
        this.builder = builder;
    }
    public void constructor(){
        builder.makeTitle("Greeting");
        builder.makeString("从早上到晚上");
        builder.makeItem(new String[]{"早上好","晚上好"});
        builder.close();
    }
}
