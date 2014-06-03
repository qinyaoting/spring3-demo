package com.xyz.design_pattern.chapter8.optimize2;

import com.xyz.design_pattern.chapter8.optimize.LeiFeng;
import com.xyz.design_pattern.chapter8.optimize.Undergraduate;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/3/14
 * Time: 9:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class UndergraduateFactory implements IFactory {
    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();  //To change body of implemented methods use File | Settings | File Templates.
    }
}
