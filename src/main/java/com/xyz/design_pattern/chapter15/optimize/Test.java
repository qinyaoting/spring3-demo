package com.xyz.design_pattern.chapter15.optimize;

import com.xyz.design_pattern.chapter15.User;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 11:15 AM
 * To change this template use File | Settings | File Templates.
 */
public class Test {


    public static final void main(String[] args) {
        User user = new User();
        IFactory factory = new SqlServerFactory();      // 若要改成Access数据库，只需要改成IFactory factory = new AccessFactory();

        IUser iu = factory.createUser();
        iu.insert(user);
        iu.getUser(1);
    }
}
