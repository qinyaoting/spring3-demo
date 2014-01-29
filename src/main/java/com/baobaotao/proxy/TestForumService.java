package com.baobaotao.proxy;

import java.lang.reflect.Proxy;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/22/14
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestForumService {

    public static void main(String[] args) {
        /*ForumService forumService = new ForumServiceImpl();
        forumService.removeForum(10);
        forumService.removeTopic(1012);*/


        /*ForumService target = new ForumServiceImpl();
        PerformanceHandler handler = new PerformanceHandler(target);
        ForumService proxy = (ForumService)Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                handler);
        proxy.removeForum(10);
        proxy.removeTopic(1012);*/

        CglibProxy proxy = new CglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl) proxy.getProxy(ForumServiceImpl.class);
        forumService.removeForum(10);
        forumService.removeTopic(1012);


    }
}
