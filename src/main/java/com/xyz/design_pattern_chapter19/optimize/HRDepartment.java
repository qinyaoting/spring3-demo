package com.xyz.design_pattern_chapter19.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/15/14
 * Time: 6:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class HRDepartment extends Company {

    protected HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void remove(Company c) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void display(int depth) {

        for (int i=0;i<depth;i++)
            System.out.print("-");
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.println(name + " 员工培训");
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
