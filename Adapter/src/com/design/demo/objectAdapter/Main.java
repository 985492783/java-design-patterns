package com.design.demo.objectAdapter;

/**
 * @author 98549
 * @date 2022/1/20 17:14
 */
public class Main {
    public static void main(String[] args) {
        PrintBanner pb=new PrintBanner("HelloWorld");
        pb.printWeak();
        pb.printStrong();
    }
}
