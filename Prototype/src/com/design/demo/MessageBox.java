package com.design.demo;

/**
 * @author 98549
 * @date 2022/1/23 17:10
 */
public class MessageBox implements PrototypeProduct{
    private char decochar;
    public MessageBox(char decochar){
        this.decochar = decochar;
    }
    @Override
    public void use(String s){
        int length = s.getBytes().length;
        for(int i=0;i<length+4;i++){
            System.out.print(decochar);
        }
        System.out.println("");
        System.out.println(decochar+" "+s+" "+decochar);
        for(int i=0;i<length+4;i++){
            System.out.print(decochar);
        }
        System.out.println("");
    }

    @Override
    public PrototypeProduct createPrototypeProduct() {
        PrototypeProduct p = null;
        try{
            p=(PrototypeProduct) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
