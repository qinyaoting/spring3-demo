package com.xyz.design_pattern.chapter9.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 10:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class ConcretePrototype1 extends Prototype {


    protected ConcretePrototype1(String id) {
        super(id);
    }

    @Override
    public Prototype cloneObj() {
        try {
            return (Prototype)(this.clone());  //To change body of implemented methods use File | Settings | File Templates.
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }


    public static final void main(String[] args) {

        ConcretePrototype1 p1 = new ConcretePrototype1("I");
        //===ConcretePrototype1 c1 = (ConcretePrototype1) p1.cloneObj();

        //===System.out.printf("Cloned:%s%n",c1.getId());
    }
}
