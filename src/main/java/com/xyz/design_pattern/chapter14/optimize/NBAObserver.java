package com.xyz.design_pattern.chapter14.optimize;

import com.xyz.design_pattern.chapter14.Secretary;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 4:35 PM
 * To change this template use File | Settings | File Templates.
 */
public class NBAObserver extends Observer {

    public NBAObserver(String name, Secretary sub) {
        super(name, sub);
    }

    @Override
    public void update() {
        System.out.println(name + ":" + sub.getAction() + "关闭NBA直播，继续工作");
    }
}
