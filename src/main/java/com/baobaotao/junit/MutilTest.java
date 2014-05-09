package com.baobaotao.junit;

import com.google.common.collect.*;
import org.junit.Test;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/25/14
 * Time: 9:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class MutilTest {

    @Test
    public void testWordCount(){
        String strWorld="wer|dffd|ddsa|dfd|dreg|de|dr|ce|ghrt|cf|gt|ser|tg|ghrt|cf|gt|" +
                "ser|tg|gt|kldf|dfg|vcd|fg|gt|ls|lser|dfr|wer|dffd|ddsa|dfd|dreg|de|dr|" +
                "ce|ghrt|cf|gt|ser|tg|gt|kldf|dfg|vcd|fg|gt|ls|lser|dfr";
        String[] words=strWorld.split("\\|");
        Map<String, Integer> countMap = new HashMap<String, Integer>();
        for (String word : words) {
            Integer count = countMap.get(word);
            if (count == null) {
                countMap.put(word, 1);
            }
            else {
                countMap.put(word, count + 1);
            }
        }
        System.out.println("countMap：");
        for(String key:countMap.keySet()){
            System.out.println(key+" count："+countMap.get(key));
        }
    }

    @Test
    public void testMultsetWordCount(){
        String strWorld="wer|dfd|dd|dfd|dda|de|dr";
        String[] words=strWorld.split("\\|");
        List<String> wordList=new ArrayList<String>();
        for (String word : words) {
            wordList.add(word);
        }
        // HashMultiset 新建 ，然后把wordlist添加进来
        Multiset<String> wordsMultiset = HashMultiset.create();
        wordsMultiset.addAll(wordList);

        for(String key:wordsMultiset.elementSet()){
            System.out.println(key+" count："+wordsMultiset.count(key));
        }

        /**
         * Multiset接口定义的接口主要有：
         　　　　add(E element) :向其中添加单个元素
         　　　　add(E element,int occurrences) : 向其中添加指定个数的元素
         　　　　count(Object element) : 返回给定参数元素的个数
         　　　　remove(E element) : 移除一个元素，其count值 会响应减少
         　　　　remove(E element,int occurrences): 移除相应个数的元素
         　　　　elementSet() : 将不同的元素放入一个Set中
         　　　　entrySet(): 类似与Map.entrySet 返回Set<Multiset.Entry>。包含的Entry支持使用getElement()和getCount()
         　　　　setCount(E element ,int count): 设定某一个元素的重复次数
         　　　　setCount(E element,int oldCount,int newCount): 将符合原有重复个数的元素修改为新的重复次数
         　　　　retainAll(Collection c) : 保留出现在给定集合参数的所有的元素
         　　　　removeAll(Collectionc) : 去除出现给给定集合参数的所有的元素
         */
    }

    @Test
    public void testMultsetWordCount2(){
        String strWorld="wer|dfd|dd|dfd|dda|de|dr";
        String[] words=strWorld.split("\\|");
        List<String> wordList=new ArrayList<String>();
        for (String word : words) {
            wordList.add(word);
        }
        Multiset<String> wordsMultiset = HashMultiset.create();
        wordsMultiset.addAll(wordList);


        //System.out.println("wordsMultiset："+wordsMultiset);

        for(String key:wordsMultiset.elementSet()){
            System.out.println(key+" count："+wordsMultiset.count(key));
        }

        if(!wordsMultiset.contains("peida")){
            wordsMultiset.add("peida", 2);
        }
        System.out.println("============================================");
        for(String key:wordsMultiset.elementSet()){
            System.out.println(key+" count："+wordsMultiset.count(key));
        }


        if(wordsMultiset.contains("peida")){
            wordsMultiset.setCount("peida", 23);
        }

        System.out.println("============================================");
        for(String key:wordsMultiset.elementSet()){
            System.out.println(key+" count："+wordsMultiset.count(key));
        }

        if(wordsMultiset.contains("peida")){
            wordsMultiset.setCount("peida", 23,45);
        }

        System.out.println("============================================");
        for(String key:wordsMultiset.elementSet()){
            System.out.println(key+" count："+wordsMultiset.count(key));
        }

        if(wordsMultiset.contains("peida")){
            wordsMultiset.setCount("peida", 44,67);
        }

        System.out.println("============================================");
        for(String key:wordsMultiset.elementSet()){
            System.out.println(key+" count："+wordsMultiset.count(key));
        }
    }

    /**
     * 需要注意的是Multiset不是一个Map<E,Integer>,尽管Multiset提供一部分类似的功能实现。其它值得关注的差别有:
     　　Multiset中的元素的重复个数只会是正数，且最大不会超过Integer.MAX_VALUE。设定计数为0的元素将不会出现multiset中，也不会出现elementSet()和entrySet()的返回结果中。
     　　multiset.size() 方法返回的是所有的元素的总和，相当于是将所有重复的个数相加。如果需要知道每个元素的个数可以使用elementSet().size()得到.(因而调用add(E)方法会是multiset.size()增加1).
     　　multiset.iterator() 会循环迭代每一个出现的元素，迭代的次数与multiset.size()相同。 iterates over each occurrence of each element, so the length of the iteration is equal to multiset.size().
     　　Multiset 支持添加、移除多个元素以及重新设定元素的个数。执行setCount(element,0)相当于移除multiset中所有的相同元素。
     　　调用multiset.count(elem)方法时，如果该元素不在该集中，那么返回的结果只会是0。
     */





}
