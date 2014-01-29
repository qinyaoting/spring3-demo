package com.xyz.redis;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/29/14
 * Time: 9:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class MessageDelegateListenerImpl implements MessageDelegateListener {


    // 如果redis收到消息，会调用handleMessage方法
    @Override
    public void handleMessage(Serializable message) {
        //什么都不做,只输出
        if(message == null){
            System.out.println("null");
        } else if(message.getClass().isArray()){
            System.out.println(Arrays.toString((Object[]) message));
        } else if(message instanceof List<?>) {
            System.out.println(message);
        } else if(message instanceof Map<? , ?>) {
            System.out.println(message);
        } else {
            System.out.println(ToStringBuilder.reflectionToString(message));
        }
    }
}
