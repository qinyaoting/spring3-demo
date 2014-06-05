package com.xyz.design_pattern.chapter15.optimize3;

import com.xyz.design_pattern.chapter15.optimize.AccessUser;
import com.xyz.design_pattern.chapter15.optimize.IUser;
import com.xyz.design_pattern.chapter15.optimize.SqlServerUser;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 11:34 AM
 * To change this template use File | Settings | File Templates.
 */
public class DataAccess {

    private static final int db = 1;        //Sqlserver
    //private static final int db = 2;     //Access


    // 简单工厂方法
    public static IUser createUser() {
        IUser result = null;
        switch (db) {
            case 1:
                result = new SqlServerUser();
                break;
            case 2:
                result = new AccessUser();
                break;
        }
        return result;
    }

    public static IDepartment createDepartment() {
        IDepartment result = null;
        switch (db) {
            case 1:
                result = new SqlServerDepartment();
                break;
            case 2:
                result = new AccessDepartment();
                break;

        }
        return result;
    }
}
