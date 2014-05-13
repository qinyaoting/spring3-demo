package com.xyz.design_pattern.chapter15;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 11:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class SqlserverUser
{

    public void insert(User user) {
        System.out.println("在SQL Server中给User表增加一条记录");
    }

    public void getUser(int id) {
        System.out.println("在SQL Server中根据id得到User的一条记录");
    }
}
