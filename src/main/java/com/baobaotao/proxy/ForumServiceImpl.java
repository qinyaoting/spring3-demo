package com.baobaotao.proxy;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/22/14
 * Time: 10:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class ForumServiceImpl implements ForumService {

    public void removeTopic(int topicId) {

        //PerformanceMonitor.begin("com.baobaotao.proxy.ForumServiceImpl.removeTopic");
        System.out.println(" remove topic " + topicId);
        try {
            Thread.currentThread().sleep(20);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //PerformanceMonitor.end();
    }

    public void removeForum(int forumId) {
        //PerformanceMonitor.begin("com.baobaotao.proxy.ForumServiceImpl.removeForum");
        System.out.println(" remove Forum " + forumId);
        try {
            Thread.currentThread().sleep(40);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //PerformanceMonitor.end();
    }


}
