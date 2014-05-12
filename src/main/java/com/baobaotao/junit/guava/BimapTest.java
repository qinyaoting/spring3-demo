package com.baobaotao.junit.guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 2:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class BimapTest {

    @Test
    public void logMapTest(){
        Map<Integer,String> logfileMap = Maps.newHashMap();
        logfileMap.put(1,"a.log");
        logfileMap.put(2,"b.log");
        logfileMap.put(3,"c.log");
        System.out.println("logfileMap:"+logfileMap);
    }

    public static <S,T> Map<T,S> getInverseMap(Map<S,T> map) {
        Map<T,S> inverseMap = new HashMap<T,S>();
        for(Map.Entry<S,T> entry: map.entrySet()) {
            inverseMap.put(entry.getValue(), entry.getKey());
        }
        return inverseMap;
    }

    @Test
    public void logMapTest2(){
        Map<Integer,String> logfileMap = Maps.newHashMap();
        logfileMap.put(1,"a.log");
        logfileMap.put(2,"b.log");
        logfileMap.put(3,"c.log");

        System.out.println("logfileMap:"+logfileMap);

        Map<String,Integer> logfileInverseMap = Maps.newHashMap();

        logfileInverseMap=getInverseMap(logfileMap);

        System.out.println("logfileInverseMap:"+logfileInverseMap);
    }

    /**
     *  上面的代码可以帮助我们实现map倒转的要求，但是还有一些我们需要考虑的问题:
     　　1. 如何处理重复的value的情况。不考虑的话，反转的时候就会出现覆盖的情况.
     　　2. 如果在反转的map中增加一个新的key，倒转前的map是否需要更新一个值呢?
     　　在这种情况下需要考虑的业务以外的内容就增加了，编写的代码也变得不那么易读了。这时我们就可以考虑使用Guava中的BiMap了。
     */

    @Test
    public void BimapTest(){
        BiMap<Integer,String> logfileMap = HashBiMap.create();
        logfileMap.put(1,"a.log");
        logfileMap.put(2,"b.log");
        logfileMap.put(3,"c.log");
        System.out.println("logfileMap:"+logfileMap);
        BiMap<String,Integer> filelogMap = logfileMap.inverse();
        System.out.println("filelogMap:"+filelogMap);
    }

    // 在使用BiMap时，会要求Value的唯一性。如果value重复了则会抛出错误：java.lang.IllegalArgumentException，例如：

    @Test
    public void BimapTest2(){
        BiMap<Integer,String> logfileMap = HashBiMap.create();
        logfileMap.put(1,"a.log");
        logfileMap.put(2,"b.log");
        logfileMap.put(3,"c.log");
        logfileMap.put(4,"d.log");
        logfileMap.put(5,"d.log");
    }

    // logfileMap.put(5,"d.log") 会抛出java.lang.IllegalArgumentException: value already present: d.log的错误
    // 如果我们确实需要插入重复的value值，那可以选择forcePut方法。但是我们需要注意的是前面的key也会被覆盖了。

    @Test
    public void BimapTest3(){
        BiMap<Integer,String> logfileMap = HashBiMap.create();
        logfileMap.put(1,"a.log");
        logfileMap.put(2,"b.log");
        logfileMap.put(3,"c.log");

        logfileMap.put(4,"d.log");
        logfileMap.forcePut(5,"d.log");
        System.out.println("logfileMap:"+logfileMap);
    }

    // inverse方法会返回一个反转的BiMap，但是注意这个反转的map不是新的map对象，它实现了一种视图关联，这样你对于反转后的map的所有操作都会影响原先的map对象

    @Test
    public void BimapTest4(){
        BiMap<Integer,String> logfileMap = HashBiMap.create();
        logfileMap.put(1,"a.log");
        logfileMap.put(2,"b.log");
        logfileMap.put(3,"c.log");
        System.out.println("logfileMap:"+logfileMap);
        BiMap<String,Integer> filelogMap = logfileMap.inverse();
        System.out.println("filelogMap:"+filelogMap);

        logfileMap.put(4,"d.log");

        System.out.println("logfileMap:"+logfileMap);
        System.out.println("filelogMap:"+filelogMap);
    }

}
