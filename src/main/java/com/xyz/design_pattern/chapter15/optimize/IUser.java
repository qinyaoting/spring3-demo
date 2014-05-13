package com.xyz.design_pattern.chapter15.optimize;

import com.xyz.design_pattern.chapter15.User;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 11:10 AM
 * To change this template use File | Settings | File Templates.
 */
public interface IUser {

    void insert(User user);
    User getUser(int id);
}
