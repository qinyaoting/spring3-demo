package com.xyz.design_pattern.chapter15.optimize2;

import com.xyz.design_pattern.chapter15.optimize.AccessUser;
import com.xyz.design_pattern.chapter15.optimize.IUser;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 11:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new AccessUser();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IDepartment createDepartment() {
        return new AccessDepartment();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
