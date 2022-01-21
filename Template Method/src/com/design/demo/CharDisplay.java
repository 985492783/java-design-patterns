package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/21 12:53
 */
public class CharDisplay extends AbstractDisplay{
    private char c;
    public CharDisplay(char c){
        this.c=c;
    }
    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void close() {
        System.out.println(">>");
    }

    @Override
    public void print() {
        System.out.print(c);
    }
}
