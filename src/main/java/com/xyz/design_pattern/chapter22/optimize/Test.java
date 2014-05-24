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

        //对象的继承是在编译时就定义好了，所以无法在运行时改变从父类继承的实现
        //子类的实现与他的父类有非常紧密的依赖关系，以至于父类实现中的任何变化必然会导致子类发生变化
        //当你需要复用子类时，如果继承下来的实现不适合解决新的问题，则父类必须重写或被其他更合适的类替换


        // 聚合：大雁和雁群是聚合关系
        // 组合：翅膀和大雁是部分和整体关系，并且生命周期相同
    }
}
