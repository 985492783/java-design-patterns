package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/21 15:07
 */
public class FactoryMethodMain {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product car1 = factory.create("小明");
        Product car2 = factory.create("小洪");
        Product car3 = factory.create("小张");
        car1.use();
        car2.use();
        car3.use();
    }
}
