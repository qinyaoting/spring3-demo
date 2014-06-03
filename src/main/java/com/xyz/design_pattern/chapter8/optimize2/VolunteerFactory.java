package com.xyz.design_pattern.chapter8.optimize2;

import com.xyz.design_pattern.chapter8.optimize.LeiFeng;
import com.xyz.design_pattern.chapter8.optimize.Undergraduate;
import com.xyz.design_pattern.chapter8.optimize.Volunteer;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/3/14
 * Time: 9:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class VolunteerFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();  //To change body of implemented methods use File | Settings | File Templates.
    }




    public static final void main(String[] args) {

        //IFactory factory = new UndergraduateFactory();
        IFactory factory = new VolunteerFactory();
        LeiFeng student = factory.createLeiFeng();
        student.buyRice();
        student.sweep();
        student.wash();

    }
}
