package com.xyz.design_pattern.chapter25;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 12:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcreteMediator extends Mediator {

    private ConcreteColleague1 colleague1;
    private ConcreteColleague2 colleague2;

    public void setColleague1(ConcreteColleague1 colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(ConcreteColleague2 colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void send(String message, Colleague colleague) {
        if (colleague == colleague1) {
            colleague2.notif(message);
        } else {
            colleague1.notif(message);
        }
    }



    public static final void main(String[] args) {
        ConcreteMediator m = new ConcreteMediator();

        //让两个同事认识中介者
        ConcreteColleague1 c1 = new ConcreteColleague1(m);
        ConcreteColleague2 c2 = new ConcreteColleague2(m);

        //让中介者认识两个同事
        m.setColleague1(c1);
        m.setColleague2(c2);
        c1.send("吃过饭了吗？");
        c2.send("没有那，你打算请客？");


        // 有了Mediator，使得ConcreteColleague1和ConcreteColleague2在发消息和接受消息时
        // 是通过中介来完成的，减少了他们的耦合度


    }
}
