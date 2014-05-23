package com.xyz.design_pattern.chapter22.optimize3;



/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 1:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static final void main(String[] args) {

        HandsetBrand ab;
        ab = new HandsetBrandN();
        ab.setHandsetSoft(new HandsetGame());
        ab.run();
        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();


        ab = new HandsetBrandM();
        ab.setHandsetSoft(new HandsetGame());
        ab.run();
        ab.setHandsetSoft(new HandsetAddressList());
        ab.run();

        // 桥接模式：将抽象部分与他的实现部分分离，使得他们都可以独立的变化

    }
}
