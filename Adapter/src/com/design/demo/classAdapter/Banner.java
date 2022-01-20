package com.design.demo.classAdapter;

/**
 * @author 98549
 * @date 2022/1/20 16:47
 */
public class Banner {
    private String str;
    public Banner(String str){
        this.str = str;
    }

    public void showWithParen(){
        System.out.println("("+str+")");
    }
    public void showWithStar(){
        System.out.println("*"+str+"*");
    }
}
