package com.design.demo.objectAdapter;

/**
 * @author 98549
 * @date 2022/1/20 17:15
 */
public class PrintBanner extends Print{
    private Banner banner;
    public PrintBanner(String name){
        this.banner = new Banner(name);
    }
    @Override
    public void printWeak() {
        this.banner.showWithParen();
    }

    @Override
    public void printStrong() {
        this.banner.showWithStar();
    }
}
