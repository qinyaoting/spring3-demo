package com.xyz.design_pattern.chapter14.optimize;

import com.xyz.design_pattern.chapter14.StockObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 4:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class Secretary {

    // 同事列表
    private List<Observer> observers = new ArrayList<Observer>();
    private String action;

    // 增加
    public void attach(Observer observer) {     // 针对抽象编程，减少与具体类的耦合
        observers.add(observer);
    }

    // 减少
    public void notif() {
        for(Observer so : observers) {
            so.update();
        }
    }

    // 通知
    public void secretartAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
