package com.xyz.design_pattern.chapter14.optimize2;


/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 */
public interface Subject {

    void attach(Observer observer);
    void detach(Observer observer);

    void notif();

    String get();
    void set(String action);

}
