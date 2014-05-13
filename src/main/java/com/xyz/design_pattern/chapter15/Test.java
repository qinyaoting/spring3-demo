package com.xyz.design_pattern.chapter15;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 11:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    public static final void main(String[] args) {
        User user = new User();
        SqlserverUser su = new SqlserverUser();      // 与SqlserverUser耦合
        su.insert(user);
        su.getUser(1);
    }
}
