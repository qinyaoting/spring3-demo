package com.xyz.effect.chapter8.num52;

import java.util.List;
import java.util.Vector;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 6/4/14
 * Time: 2:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {

    //通过接口引用对象

    //Good uses interface as type

    List<Subscriber> subscribers = new Vector<Subscriber>();

    //Bad uses class as type
    //Vector<Subscriber> subscribers = new Vector<Subscriber>();


}
