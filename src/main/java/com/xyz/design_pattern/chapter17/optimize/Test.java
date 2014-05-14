package com.xyz.design_pattern.chapter17.optimize;

import com.xyz.design_pattern.chapter17.Adapter;
import com.xyz.design_pattern.chapter17.Target;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/14/14
 * Time: 2:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    // 适配器模式（adapter）将一个类的接口转换成客户希望的另外一个接口
    //

    public static final void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        b.attach();

        Player m = new Guards("麦克格雷斯");
        m.attach();

        Player ym = new Translator("姚明");
        ym.attach();
        ym.defense();
    }
}
