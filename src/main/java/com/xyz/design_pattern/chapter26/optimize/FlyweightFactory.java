package com.xyz.design_pattern.chapter26.optimize;

import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/22/14
 * Time: 11:25 AM
 * To change this template use File | Settings | File Templates.
 */
public class FlyweightFactory {

    private Hashtable flyweights = new Hashtable();

    public FlyweightFactory() {
        flyweights.put("X", new ConcreteFlyweight());
        flyweights.put("Y", new ConcreteFlyweight());
        flyweights.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key) {
        return (Flyweight)flyweights.get(key);
    }


    public static final void main(String[] args) {

        int extrinsicstate = 22;
        FlyweightFactory f = new FlyweightFactory();
        Flyweight fx = f.getFlyweight("X");
        fx.operation(--extrinsicstate);

        Flyweight fy = f.getFlyweight("Y");
        fy.operation(--extrinsicstate);

        Flyweight fz = f.getFlyweight("Z");
        fz.operation(--extrinsicstate);

        UnsharedFlyweight uf = new UnsharedFlyweight();
        uf.operation(--extrinsicstate);
    }
}
