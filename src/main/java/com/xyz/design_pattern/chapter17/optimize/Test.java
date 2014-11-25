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

    // 20141125
    public static final void main(String[] args) {
        Player b = new Forwards("巴蒂尔");
        b.attach();

        Player m = new Guards("麦克格雷斯");
        m.attach();

        Player ym = new Translator("姚明");
        ym.attach();
        ym.defense();
    }


    /**
     *  姚明刚去NBA打球，不会外语，需要翻译，翻译就是适配器
        我们不能修改教练 球员 姚明的前提下，就想办法找个适配器
        系统的数据和行为都正确，但接口不符时，应该考虑用适配器，目的是使控制之外的一个原有对象与某个接口匹配，
        适配器模式主要应用于希望复用一些现存的类，但是接口又与复用环境要求不一致的情况
     */
}
