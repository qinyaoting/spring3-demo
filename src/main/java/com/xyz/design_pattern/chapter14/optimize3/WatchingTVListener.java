package com.xyz.design_pattern.chapter14.optimize3;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/20/14
 * Time: 3:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class WatchingTVListener {
    public WatchingTVListener(){
        System.out.println("我正在看电视\t\t"+new Date());
    }
    public void stopWatchingTV(Date date){
        System.out.println("老师来了，快关闭电视 。 结束时间\t"+date);
    }
}
