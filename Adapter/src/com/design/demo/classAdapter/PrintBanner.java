package com.design.demo.classAdapter;

/**
 * @author 98549
 * @date 2022/1/20 16:47
 */
public class PrintBanner extends Banner implements Print{
    public PrintBanner(String str) {
        super(str);
    }

    @Override
    public void PrintWeak() {
        showWithParen();
    }

    @Override
    public void PrintStrong() {
        showWithStar();
    }
}
