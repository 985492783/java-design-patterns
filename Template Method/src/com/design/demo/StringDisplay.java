package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/21 12:54
 */
public class StringDisplay extends AbstractDisplay{
    private String str;
    public StringDisplay(String str){
        this.str=str;
    }

    @Override
    public void open() {
        System.out.println("++++++++++");
    }

    @Override
    public void close() {
        System.out.println("++++++++++");
    }

    @Override
    public void print() {
        System.out.println("|"+str+"|");
    }
}
