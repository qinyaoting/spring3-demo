package com.xyz.design_pattern.chapter15.optimize2;

import com.xyz.design_pattern.chapter15.optimize.IUser;
import com.xyz.design_pattern.chapter15.optimize.SqlServerUser;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 11:13 AM
 * To change this template use File | Settings | File Templates.
 */
public class SqlServerFactory implements IFactory {
    @Override
    public IUser createUser() {
        return new SqlServerUser();  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public IDepartment createDepartment() {
        return new SqlServerDepartment();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
