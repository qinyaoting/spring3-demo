package com.xyz.design_pattern.chapter17.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class Translator extends Player {


    private ForeignCenter wjzf = new ForeignCenter();

    protected Translator(String name) {
        wjzf.setName(name);
    }

    @Override
    public void attach() {
        wjzf.chonga();
    }

    @Override
    public void defense() {
        wjzf.fengshou();
    }
}
