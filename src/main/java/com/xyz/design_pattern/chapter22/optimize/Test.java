package com.xyz.design_pattern.chapter22.optimize;


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
        ab = new HandsetBrandMAdressList();
        ab.run();

        ab = new HandsetBrandMGame();
        ab.run();

        ab = new HandsetBrandNAdressList();
        ab.run();
        ab = new HandsetBrandNGame();
        ab.run();


        // 聚合：大雁和雁群是聚合关系
        // 组合：翅膀和大雁是部分和整体关系，并且生命周期相同
    }
}
