package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/21 12:47
 */
public class TemplateMethodMain {
    public static void main(String[] args) {
        AbstractDisplay a = new CharDisplay('c');
        AbstractDisplay b = new StringDisplay("HelloWorld");
        a.display();
        b.display();
    }
}
