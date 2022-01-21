package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/21 17:13
 */
public class Maker {
    private static Maker instance = null;
    private Maker() {
        System.out.println("生成实例");
    }
    public static Maker getInstance(){
        if(instance==null){
            create();
        }
        return instance;
    }
    public synchronized static void create(){
        if(instance==null){
            instance = new Maker();
        }
    }
}
