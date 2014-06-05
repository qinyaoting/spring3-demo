package com.xyz.design_pattern.chapter14.optimize2;

import com.xyz.design_pattern.chapter14.Secretary;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 4:31 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class Observer {

    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) { //前台类改成抽象通知者
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
