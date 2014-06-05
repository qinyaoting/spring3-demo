package com.xyz.design_pattern.chapter17.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 2:52 PM
 * To change this template use File | Settings | File Templates.
 */

// 继承Player
public class Translator extends Player {

    // 里边有个外籍球员
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
        wjzf.fangshou();
    }
}
