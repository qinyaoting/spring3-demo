package com.xyz.design_pattern.chapter15.optimize;

import com.xyz.design_pattern.chapter15.User;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class SqlServerUser implements IUser {

    @Override
    public void insert(User user) {
        System.out.println("在SQL Server中给User表增加一条记录");
    }

    @Override
    public User getUser(int id) {
        System.out.println("在SQL Server中根据id得到User的一条记录");
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
