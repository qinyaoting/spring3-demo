package com.xyz.design_pattern.chapter22.optimize3;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 1:59 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class HandsetBrand {

    // 手机品牌和手机软件是聚合关系，雁群和大雁关系，手机品牌包含有手机软件，但软件不一定是品牌的一部分
    protected HandsetSoft soft;

    public void setHandsetSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
