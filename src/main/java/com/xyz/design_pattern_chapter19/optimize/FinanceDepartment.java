package com.xyz.design_pattern_chapter19.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/15/14
 * Time: 6:10 PM
 * To change this template use File | Settings | File Templates.
 */
public class FinanceDepartment extends Company {

    protected FinanceDepartment(String name) {
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
        //To change body of implemented methods use File | Settings | File Templates.
        for (int i=0;i<depth;i++)
            System.out.print("--");
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        //To change body of implemented methods use File | Settings | File Templates.
        System.out.println(name + " 公司财务管理");
    }
}
