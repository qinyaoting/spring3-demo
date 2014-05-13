package com.xyz.design_pattern.chapter15.optimize2;

import com.xyz.design_pattern.chapter15.optimize.IUser;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 11:13 AM
 * To change this template use File | Settings | File Templates.
 */
public interface IFactory {

    IUser createUser();

    IDepartment createDepartment();
}
