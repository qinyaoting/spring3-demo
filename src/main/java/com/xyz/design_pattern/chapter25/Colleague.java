package com.xyz.design_pattern.chapter25;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 12:02 PM
 * To change this template use File | Settings | File Templates.
 */
abstract class Colleague {

    protected Mediator mediator;

    protected Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
