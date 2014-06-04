package com.xyz.design_pattern.chapter9.optimize3;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 11:04 AM
 * To change this template use File | Settings | File Templates.
 */
public class WorkExperience {

    private String workDate;
    private String company;

    public String getWorkDate() {
        return workDate;
    }

    public void setWorkDate(String workDate) {
        this.workDate = workDate;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }


    public static final void main(String[] args) throws CloneNotSupportedException {

        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男","29");
        a.setWorkExperience("1998-2000","XX 公司");

        Resume b = (Resume)a.clone();
        b.setWorkExperience("1998-2006","YY 公司");

        Resume c = (Resume)a.clone();
        c.setWorkExperience("1998-2003","ZZ 公司");

        a.display();
        b.display();
        c.display();


        /**
         *
         个人信息 大鸟 男 29
         工作经历 1998-2003 ZZ 公司
         个人信息 大鸟 男 29
         工作经历 1998-2003 ZZ 公司
         个人信息 大鸟 男 29
         工作经历 1998-2003 ZZ 公司
         浅复制，结果为最有一次修改的内容
         */
    }
}
