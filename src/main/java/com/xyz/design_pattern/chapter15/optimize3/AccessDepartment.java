package com.xyz.design_pattern.chapter15.optimize3;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class AccessDepartment implements IDepartment {

    @Override
    public void insert(Department department) {
        System.out.println("在Access Server中给department表增加一条记录");
    }

    @Override
    public Department getDepartment(int id) {
            System.out.println("在Access Server中根据id得到department的一条记录");
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }


}
