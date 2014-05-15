package com.xyz.design_pattern_chapter19.optimize;


import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/15/14
 * Time: 6:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteCompany extends Company {

    private List<Company> children = new ArrayList<Company>();

    protected ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void display(int depth) {
        for (int i=0;i<depth;i++)
            System.out.print("-");

        for (Company c: children) {
            c.display(depth + 2);
        }

    }

    @Override
    public void lineOfDuty() {
        for (Company c: children) {
            c.lineOfDuty();
        }
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
