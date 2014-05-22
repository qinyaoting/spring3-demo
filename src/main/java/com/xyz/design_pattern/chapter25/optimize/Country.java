package com.xyz.design_pattern.chapter25.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/22/14
 * Time: 10:45 AM
 * To change this template use File | Settings | File Templates.
 */
abstract class Country {

    protected UniteNations mediator;

    protected Country(UniteNations mediator) {
        this.mediator = mediator;
    }
}
