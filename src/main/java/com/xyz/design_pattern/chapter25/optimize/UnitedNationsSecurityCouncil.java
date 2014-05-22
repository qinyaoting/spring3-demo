package com.xyz.design_pattern.chapter25.optimize;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/22/14
 * Time: 10:48 AM
 * To change this template use File | Settings | File Templates.
 */
public class UnitedNationsSecurityCouncil extends UniteNations {


    private USA colleague1;
    private Iraq colleague2;

    public void setColleague1(USA colleague1) {
        this.colleague1 = colleague1;
    }

    public void setColleague2(Iraq colleague2) {
        this.colleague2 = colleague2;
    }

    @Override
    public void declare(String message, Country colleague) {
        if (colleague == colleague1)
            colleague2.getMessage(message);
        else
            colleague1.getMessage(message);
    }



    public static final void main(String[] args) {


        UnitedNationsSecurityCouncil UNSC = new UnitedNationsSecurityCouncil();

        USA c1 = new USA(UNSC);
        Iraq c2 = new Iraq(UNSC);

        UNSC.setColleague1(c1);
        UNSC.setColleague2(c2);
        c1.declare("不准研制核武器，否则要发动战争 ");
        c2.declare("我们没有核武器，也不怕侵略");
    }

    // 中介模式优缺点：

    //一般用于一组对象以定义良好但是复杂的方式进行通信的场合
}
