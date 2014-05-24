package com.xyz.design_pattern.chapter24;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 11:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class Manager {

    protected String name;

    public Manager(String name) {
        this.name = name;
    }

    public void getResult(String managerLevel, Requset requset) {
        if (managerLevel.equals("经理")) {
            if (requset.getRequestType().equals("请假") && requset.getNumber() <= 2) {
                System.out.println(name + " " + requset.getRequestContent() + " " + requset.getNumber() + " 通过" );
            } else {
                System.out.println(name + " " + requset.getRequestContent() + " " + requset.getNumber() + " 无权处理" );
            }
        } else if (managerLevel.equals("总监")) {
            if (requset.getRequestType().equals("请假") && requset.getNumber() <= 5) {
                System.out.println(name + " " + requset.getRequestContent() + " " + requset.getNumber() + " 通过" );
            } else {
                System.out.println(name + " " + requset.getRequestContent() + " " + requset.getNumber() + " 无权处理" );
            }
        } else if (managerLevel.equals("总经理")) {
            if (requset.getRequestType().equals("请假")) {
                System.out.println(name + " " + requset.getRequestContent() + " " + requset.getNumber() + " 通过" );
            } else if (requset.getRequestType().equals("加薪") && requset.getNumber() <= 500){
                System.out.println(name + " " + requset.getRequestContent() + " " + requset.getNumber() + " 通过" );
            } else if (requset.getRequestType().equals("加薪") && requset.getNumber() > 500){
                System.out.println(name + " " + requset.getRequestContent() + " " + requset.getNumber() + " 再说吧" );
            }
        }
    }

    // 如果增加项目经理、部门经理、人力总监、副总经理，那就意味着要修改Manager这个类
    // 这个类承担了太多的责任，这违背了单一职责原则，增加新的管理类别，需要修改这个类，违反了开放封闭原则

    public static final void main(String[] args) {


        Manager jinli = new Manager("金利");
        Manager zongjian = new Manager("宗剑");
        Manager zhongjingli = new Manager("钟精力");


        Requset requset = new Requset();
        requset.setRequestType("加薪");
        requset.setRequestContent("小菜请求加薪");
        requset.setNumber(1000);


        jinli.getResult("经理",requset);
        zongjian.getResult("总监",requset);
        zhongjingli.getResult("总经理",requset);

        Requset requset2 = new Requset();
        requset2.setRequestType("请假");
        requset2.setRequestContent("小菜请假");
        requset2.setNumber(3);


        jinli.getResult("经理",requset2);
        zongjian.getResult("总监",requset2);
        zhongjingli.getResult("总经理",requset2);


    }
}
