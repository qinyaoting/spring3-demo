package com.xyz.design_pattern.chapter14.optimize;

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
    protected Secretary sub;

    public Observer(String name, Secretary sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
