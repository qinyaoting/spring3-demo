package com.baobaotao.junit.guava;

import com.google.common.collect.*;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/12/14
 * Time: 2:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class TableTest {

    /**
     * 当我们需要多个索引的数据结构的时候，通常情况下，我们只能用这种丑陋的Map<FirstName, Map<LastName, Person>>来实现。
     * 为此Guava提供了一个新的集合类型－Table集合类型，来支持这种数据结构的使用场景。
     * Table支持“row”和“column”，而且提供多种视图
     *
     * 根据行key和列key的坐标来索引value的。
     */

    @Test
    public void TableTest(){
        Table<String, Integer, String> aTable = HashBasedTable.create();

        for (char a = 'A'; a <= 'C'; ++a) {
            for (Integer b = 1; b <= 3; ++b) {
                aTable.put(Character.toString(a), b, String.format("%c%d", a, b));
            }
        }

        System.out.println(aTable.column(2));
        System.out.println(aTable.row("B"));
        System.out.println(aTable.get("B", 2));

        System.out.println(aTable.contains("D", 1));
        System.out.println(aTable.containsColumn(3));
        System.out.println(aTable.containsRow("C"));
        System.out.println(aTable.columnMap());
        System.out.println(aTable.rowMap());

        System.out.println(aTable.remove("B", 3));
    }

    @Test
    public  void ClassToInstanceMapTest() {
        ClassToInstanceMap<String> classToInstanceMapString = MutableClassToInstanceMap.create();
        ClassToInstanceMap<Person> classToInstanceMap =MutableClassToInstanceMap.create();
        Person person= new Person("peida",20);
        System.out.println("person name :"+person.name+" age:"+person.age);
        classToInstanceMapString.put(String.class, "peida");
        System.out.println("string:"+classToInstanceMapString.getInstance(String.class));

        classToInstanceMap.putInstance(Person.class,person);
        Person person1=classToInstanceMap.getInstance(Person.class);
        System.out.println("person1 name :"+person1.name+" age:"+person1.age);
    }

    class Person {
        public String name;
        public int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    // RangeSet用来处理一系列不连续，非空的range。当添加一个range到一个RangeSet之后，
    // 任何有连续的range将被自动合并，而空的range将被自动去除。例如：

    @Test
    public void RangeSetTest(){
        RangeSet<Integer> rangeSet = TreeRangeSet.create();
        rangeSet.add(Range.closed(1, 10));
        System.out.println("rangeSet:"+rangeSet);
        //[0-10]
        rangeSet.add(Range.closedOpen(11, 15));
        System.out.println("rangeSet:"+rangeSet);
        // [[1‥10], [11‥15)
        rangeSet.add(Range.open(15, 20));
        System.out.println("rangeSet:"+rangeSet);
        // [1‥10], [11‥15), (15‥20)

        rangeSet.add(Range.openClosed(0, 0));
        System.out.println("rangeSet:"+rangeSet);
        // 没变化

        rangeSet.remove(Range.open(5, 10));
        System.out.println("rangeSet:"+rangeSet);
        // [1‥5], [10‥10], [11‥15), (15‥20)
    }

    // RangeMap代表了非连续非空的range对应的集合。不像RangeSet，
    // RangeMap不会合并相邻的映射，甚至相邻的range对应的是相同的值

    @Test
    public void RangeMapTest(){
        RangeMap<Integer, String> rangeMap = TreeRangeMap.create();
        rangeMap.put(Range.closed(1, 10), "foo");
        System.out.println("rangeMap:"+rangeMap);


        rangeMap.put(Range.open(3, 6), "bar");
        System.out.println("rangeMap:"+rangeMap);
        rangeMap.put(Range.open(10, 20), "foo");
        System.out.println("rangeMap:"+rangeMap);
        rangeMap.remove(Range.closed(5, 11));
        System.out.println("rangeMap:"+rangeMap);
    }
}
