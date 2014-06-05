package com.xyz.design_pattern.chapter15.optimize3;

import com.xyz.design_pattern.chapter15.User;
import com.xyz.design_pattern.chapter15.optimize.IUser;

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
        Department dept = new Department();

        IUser iu = DataAccess.createUser();

        iu.insert(user);
        iu.getUser(1);

        IDepartment id = DataAccess.createDepartment();
        id.insert(dept);
        id.getDepartment(1);

        // .net 反射可以改进简单工厂方法的问题
    }
}
