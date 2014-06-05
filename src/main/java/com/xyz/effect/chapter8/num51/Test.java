package com.xyz.effect.chapter8.num51;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 2:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    //当心字符串链接的性能

    // 为连接n个字符串而重复使用字符串连接操作符，需要n的平方级的时间


    /*public String statement() {
        String restult = "";

        for(int i=0;i<numItem();i++) {
            restult += lineForItem(i);
        }
        return restult;
    }*/

    // 如果项目数量巨大，这个方法的执行时间就难以估算

    /*public String statement() {

        StringBuilder b = new StringBuilder(numItem() * LINE_WIDTH);
        for(int i=0;i<numItem();i++) {
            b.append(lineForItem(i))
        }
        return b.toString();
    }*/
}
