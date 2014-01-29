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
public interface MessageDelegateListener {

    void handleMessage(Serializable message);
}
