package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/23 17:04
 */
public class PrototypeMain {
    public static void main(String[] args) {
        Manager manager = new Manager();
        PrototypeProduct mbox=new MessageBox('*');
        PrototypeProduct sbox=new MessageBox('/');
        manager.register("warning",mbox);
        manager.register("Sla",sbox);
        PrototypeProduct p1=manager.create("warning");
        p1.use("Hello,World");
        PrototypeProduct p2=manager.create("Sla");
        p2.use("Hello,World");
    }
}
