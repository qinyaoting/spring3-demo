package com.xyz.design_pattern.chapter9.optimize2;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 10:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private String timeArea;
    private String company;

    public Resume(String name) {
        this.name = name;
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String timeArea, String company) {
        this.timeArea = timeArea;
        this.company = company;
    }

    public void display() {

        System.out.printf("个人信息 %s %s %s%n",name,sex,age);
        System.out.printf("工作经历 %s %s%n", timeArea, company);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static final void main(String[] args) throws CloneNotSupportedException {

        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExperience("1998-2000","XX 公司");

        Resume b = (Resume)a.clone();
        b.setWorkExperience("1998-2006","YY 公司");

        Resume c = (Resume)a.clone();
        c.setPersonalInfo("男","24");

        a.display();
        b.display();
        c.display();
    }
}
