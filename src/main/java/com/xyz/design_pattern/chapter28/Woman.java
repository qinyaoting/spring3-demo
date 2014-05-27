package com.xyz.design_pattern.chapter28;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/27/14
 * Time: 10:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class Woman extends Person {


    @Override
    public void getConclusion() {
        if (action.equals("成功")) {
            System.out.println(this.getClass().getName() + " " + action + " ，背后多半有一个不成功的男人");
        } else if (action.equals("失败")) {
            System.out.println(this.getClass().getName() + " " + action + " ，眼泪汪汪，谁也劝不了");
        } else if (action.equals("恋爱")) {
            System.out.println(this.getClass().getName() + " " + action + " ，懂也懂不懂");
        }

        // if else 在Man Woman都有，隘眼，
        // 扩展时，如果增加一个结婚状态，两个类都得修改
    }


    public static final void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        Person man1 = new Man();
        man1.setAction("成功");
        persons.add(man1);

        Person woman1 = new Woman();
        woman1.setAction("成功");
        persons.add(woman1);

        Person man2 = new Man();
        man2.setAction("失败");
        persons.add(man2);

        Person woman2 = new Woman();
        woman2.setAction("失败");
        persons.add(woman2);

        Person man3 = new Man();
        man3.setAction("恋爱");
        persons.add(man3);

        Person woman3 = new Woman();
        woman3.setAction("恋爱");
        persons.add(woman3);

        for(Person p : persons)
            p.getConclusion();

    }
}
