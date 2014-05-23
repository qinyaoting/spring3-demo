package com.xyz.design_pattern.chapter22.optimize3;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/20/14
 * Time: 1:59 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class HandsetBrand {

    protected HandsetSoft soft;

    public void setHandsetSoft(HandsetSoft soft) {
        this.soft = soft;
    }

    public abstract void run();
}
