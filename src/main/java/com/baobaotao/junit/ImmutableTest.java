package com.baobaotao.junit;

import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;
import org.junit.Test;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/25/14
 * Time: 9:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class ImmutableTest {

    @Test
    public void testJDKImmutable(){
        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);

        List<String> unmodifiableList= Collections.unmodifiableList(list);

        System.out.println(unmodifiableList);

        List<String> unmodifiableList1=Collections.unmodifiableList(Arrays.asList("a", "b", "c"));
        System.out.println(unmodifiableList1);

        String temp=unmodifiableList.get(1);
        System.out.println("unmodifiableList [0]："+temp);

        list.add("baby");
        System.out.println("list add a item after list:"+list);
        System.out.println("list add a item after unmodifiableList:"+unmodifiableList);

        // 实例中的最后两个add会直接抛出不可修改的错误
        unmodifiableList1.add("bb");
        System.out.println("unmodifiableList add a item after list:"+unmodifiableList1);

        unmodifiableList.add("cc");
        System.out.println("unmodifiableList add a item after list:"+unmodifiableList);

        // 说明：Collections.unmodifiableList实现的不是真正的不可变集合，当原始集合修改后，不可变集合也发生变化。不可变集合不可以修改集合数据，当强制修改时会报错，实例中的最后两个add会直接抛出不可修改的错误。
    }



    @Test
    public void testGuavaImmutable(){

        List<String> list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list："+list);

        // 从一个已经有的集合里copy
        ImmutableList<String> imlist= ImmutableList.copyOf(list);
        System.out.println("imlist："+imlist);

        ImmutableList<String> imOflist=ImmutableList.of("peida","jerry","harry");
        System.out.println("imOflist："+imOflist);

        ImmutableSortedSet<String> imSortList= ImmutableSortedSet.of("a", "b", "c", "a", "d", "b");
        System.out.println("imSortList："+imSortList);

        list.add("baby");
        System.out.println("list add a item after list:"+list);
        // 不可变集合
        System.out.println("list add a item after imlist:"+imlist);

        ImmutableSet<Color> imColorSet =
                ImmutableSet.<Color>builder()
                        .add(new Color(0, 255, 255))
                        .add(new Color(0, 191, 255))
                        .build();

        System.out.println("imColorSet:"+imColorSet);
    }

    @Test
    public void testCotyOf(){
        ImmutableSet<String> imSet=ImmutableSet.of("peida","jerry","harry","lisa");
        System.out.println("imSet："+imSet);
        ImmutableList<String> imlist=ImmutableList.copyOf(imSet);
        System.out.println("imlist："+imlist);
        ImmutableSortedSet<String> imSortSet=ImmutableSortedSet.copyOf(imSet);
        System.out.println("imSortSet："+imSortSet);

        List<String> list=new ArrayList<String>();
        for(int i=0;i<20;i++){
            list.add(i+"x");
        }
        System.out.println("list："+list);
        ImmutableList<String> imInfolist=ImmutableList.copyOf(list.subList(2, 18));
        System.out.println("imInfolist："+imInfolist);
        int imInfolistSize=imInfolist.size();
        System.out.println("imInfolistSize："+imInfolistSize);
        ImmutableSet<String> imInfoSet=ImmutableSet.copyOf(imInfolist.subList(2, imInfolistSize-3));
        System.out.println("imInfoSet："+imInfoSet);
    }

    @Test
    public void testAsList(){
        ImmutableList<String> imList=ImmutableList.of("peida","jerry","harry","lisa","jerry");
        System.out.println("imList："+imList);
        ImmutableSortedSet<String> imSortList=ImmutableSortedSet.copyOf(imList);
        System.out.println("imSortList："+imSortList);
        System.out.println("imSortList as list："+imSortList.asList());
    }

}
