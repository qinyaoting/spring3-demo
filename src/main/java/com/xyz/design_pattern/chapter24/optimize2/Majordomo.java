package com.xyz.design_pattern.chapter24.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class Majordomo extends Manger {


    protected Majordomo(String name) {
        super(name);
    }

    @Override
    public void reqeustApplications(Request request) {

        if (request.getRequestType().equals("请假") && request.getNumber() <= 5) {
            System.out.println(name + "\t" + request.getRequestContent() + "\t" + request.getNumber() + " 被批准" );
        } else {
            if (superior != null)
                superior.reqeustApplications(request);
        }
    }
}
