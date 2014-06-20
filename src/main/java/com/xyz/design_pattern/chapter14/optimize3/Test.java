package com.xyz.design_pattern.chapter14.optimize3;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/20/14
 * Time: 3:32 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static void main(String[] args) {

        //创建一个尽职尽责的放哨者
        Notifier goodNotifier=new GoodNotifier();

        //创建一个玩游戏的同学，开始玩游戏
        PlayingGameListener playingGameListener=new PlayingGameListener();
        //创建一个看电视的同学，开始看电视
        WatchingTVListener watchingTVListener=new WatchingTVListener();


        //玩游戏的同学告诉放哨的同学，老师来了告诉一下
        goodNotifier.addListener(playingGameListener, "stopPlayingGame",new Date());
        //看电视的同学告诉放哨的同学，老师来了告诉一下
        goodNotifier.addListener(watchingTVListener, "stopWatchingTV",new Date());

        PlayingBasketballListener playingBasketballListener = new PlayingBasketballListener();
        goodNotifier.addListener(playingBasketballListener, "stopPlayingBasketball",new Date());
        try{
            //一点时间后
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        //老师出现，放哨的人通知所有要帮忙的同学:老师来了
        goodNotifier.notifyX();


        /**
         *
         点评：
         1。放哨者完全不知道做游戏者的存在，完全解耦。（当然，功劳归功于Event和EventHandler，且这两个类具有通用性）
         2。老师来了后游戏者停止游戏回到座位，看电视着关闭电视。（一次通知，执行了不同类的不同方法）
         3。扩展性很高，再来一个打篮球的学生就先写个打篮球学生类，并在测试代码中告诉放哨者一下就好，放哨者完全没有变。重用性好
         http://wenku.baidu.com/link?url=PLz_rI4l-NO2WffcF3ZXtRJRFarwGYW_W1s1QEbPWhRKY7RDmCCjPd0jPPAhyVY5Udnq0IFdfjGE6ohKwH-hHibUQSsLul7JZDeGIuASklm
         */
    }
}
