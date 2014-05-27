package com.xyz.design_pattern.chapter28.optimize2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 11:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class ObjectStructure {

    private List<Element> elements = new ArrayList<Element>();

    public void attach(Element element) {
        elements.add(element);
    }

    public void detach(Element element) {
        elements.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element e : elements)
            e.accept(visitor);
    }

    public static final void main(String[] args) {

        ObjectStructure o = new ObjectStructure();
        o.attach(new ConcreteElementA());
        o.attach(new ConcreteElementB());

        ConcreteVisitor1 v1 = new ConcreteVisitor1();
        o.accept(v1);
    }
}
