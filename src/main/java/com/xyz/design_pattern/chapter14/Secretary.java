package com.xyz.design_pattern.chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 4:19 PM
 * To change this template use File | Settings | File Templates.
 */
public class Secretary {

    private List<StockObserver> observers = new ArrayList<StockObserver>();
    private String action;

    public void attach(StockObserver observer) {
        observers.add(observer);
    }

    public void notif() {
        for(StockObserver so : observers) {
            so.update();
        }
    }

    public void secretaryAction(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }
}
