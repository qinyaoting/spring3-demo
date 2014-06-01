package com.xyz.design_pattern.chapter28.optimize;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:37 AM
 * To change this template use File | Settings | File Templates.
 */
public class ObjectStructure {

    private List<Person> elements = new ArrayList<Person>();

    public void attach(Person element) {
        elements.add(element);
    }

    public void detach(Person element) {
        elements.remove(element);
    }

    public void display(Action visitor) {
        for (Person e : elements)
            e.accept(visitor);
    }


    public static final void main(String[] args) {


        ObjectStructure o = new ObjectStructure();
        o.attach(new Man());
        o.attach(new Woman());

        //成功时的反应
        Success v1 = new Success();
        o.display(v1);

        //失败时的反应
        Failing v2 = new Failing();
        o.display(v2);

        //恋爱时的反应
        Amativeness v3 = new Amativeness();
        o.display(v3);

        //====
        //====Marriage v4 = new Marriage();
        //==== o.display(v4);


        //访问者模式：visitor 适用于数据结构相对稳定的系统
        //访问者模式的目的是把处理从数据结果分离出来，很多系统可以按照算法和数据结构分开，如果这样的系统有比较稳定的数据结构，
        //又有易于变化的算法的话，使用访问者模式就是比较适合的，因为访问者模式是的算法操作的增加变得容易
    }
}
