package com.xyz.effect.chapter2.num1;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/13/14
 * Time: 2:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class Services {

    private Services(){}

    private static final Map<String, Provider> providres = new ConcurrentHashMap<String, Provider>();

    public static final String DEFAULT_PROVIDER_NAME = "<def>";

    public static void registerDefaultProvider(Provider p) {
        registerProvider(DEFAULT_PROVIDER_NAME, p);
    }

    public static void registerProvider(String name, Provider p) {
        providres.put(name, p);
    }

    public static Service newInstance() {
        return newInstance(DEFAULT_PROVIDER_NAME);
    }

    public static Service newInstance(String name) {
        Provider p = providres.get(name);
        if (p == null)
            throw new IllegalArgumentException("No provider registed with name:" + name);
        return p.newService();
    }



}
