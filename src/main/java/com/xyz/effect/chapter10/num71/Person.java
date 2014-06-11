package com.xyz.effect.chapter10.num71;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/11/14
 * Time: 11:19 AM
 * To change this template use File | Settings | File Templates.
 */
public class Person {


    private int id;
    private String name;
    private String sex;

    public Person(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
