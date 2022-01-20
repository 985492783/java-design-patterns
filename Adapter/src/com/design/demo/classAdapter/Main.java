package com.design.demo.classAdapter;

/**
 * @author 98549
 * @date 2022/1/20 16:46
 */
public class Main {
    public static void main(String[] args) {
        PrintBanner banner = new PrintBanner("Hello World");
        banner.PrintWeak();
        banner.PrintStrong();
    }
}
