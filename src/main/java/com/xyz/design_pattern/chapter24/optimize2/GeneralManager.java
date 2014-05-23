package com.xyz.design_pattern.chapter24.optimize2;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/21/14
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class GeneralManager extends Manger {


    protected GeneralManager(String name) {
        super(name);
    }

    @Override
    public void reqeustApplications(Request request) {

       

        if (request.getRequestType().equals("请假")) {
            System.out.println(name + "\t" + request.getRequestContent() + "\t" + request.getNumber() + " 被批准" );
        } else if (request.getRequestType().equals("加薪") && request.getNumber() <= 500){
            System.out.println(name + " " + request.getRequestContent() + " " + request.getNumber() + " 通过" );
        } else if (request.getRequestType().equals("加薪") && request.getNumber() > 500){
            System.out.println(name + " " + request.getRequestContent() + " " + request.getNumber() + " 再说吧" );
        }
    }


    public static final void main(String[] args) {
        CommonManager jinli = new CommonManager("金利");
        Majordomo zongjian = new Majordomo("宗剑");
        GeneralManager zhongjingli = new GeneralManager("钟精力");
        jinli.setSuperior(zongjian);
        zongjian.setSuperior(zhongjingli);

        Request request = new Request();
        request.setRequestType("请假");
        request.setRequestContent("小菜请假");
        request.setNumber(1);
        jinli.reqeustApplications(request);


        Request request2 = new Request();
        request2.setRequestType("请假");
        request2.setRequestContent("小菜请假");
        request2.setNumber(4);
        jinli.reqeustApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setRequestContent("小菜请求加薪");
        request3.setNumber(500);
        jinli.reqeustApplications(request3);

        Request request4 = new Request();
        request4.setRequestType("加薪");
        request4.setRequestContent("小菜请求加薪");
        request4.setNumber(1000);
        jinli.reqeustApplications(request4);
    }

}
