package com.xyz.effect.chapter4.num18;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 5/26/14
 * Time: 9:14 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractMapEntry<K,V> implements Map.Entry {


    public abstract K getKey();
    public abstract V getValue();

    /*public V setValue(V value) {
        throw new UnsupportedOperationException();
    }*/


    // Implements the general contract of Map.Entry.equals
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Map.Entry))
            return false;
        Map.Entry<?,?> arg = (Map.Entry) o;
        return equals(getKey() , arg.getKey()) &&
                equals(getValue(), arg.getValue());
    }

    private static boolean equals(Object o1, Object o2) {
        return o1 == null? o2 == null : o1.equals(o2);
    }

   /* @Override
    public int hashCode() {
        return hashCode(getKey() ^ hashCode(getValue()));
    }

    private static int hashCode(Object obj) {
        return obj == null ? 0: obj.hashCode();
    }*/



    //抽象类在后续的版本中，增加新的方法，比较方便
    //接口这样是不行的

    //一般来说，要想在公有接口中增加方法，而不破坏实现这个接口的所以现有类，这是不可能的、
    //之前实现该接口的类将会漏掉新增加的发发，而且无法通过编译
    //为接口增加新方法，同时为骨架实现类也增加同样的新方法，这样可以在一定程度上减小带来的破坏，但是没有真正解决问题

    //接口通常是定义多个实现的类型的最佳途径，但有个例外，即当演变当然容易性比灵活性和功能更为重要的时候
    //应该使用抽象类来定义类性，前提是必须理解并且可以接受这些局限性

}
