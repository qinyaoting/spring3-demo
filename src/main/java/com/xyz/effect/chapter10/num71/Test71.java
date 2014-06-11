package com.xyz.effect.chapter10.num71;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/22/14
 * Time: 3:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test71 {

    //慎用延迟初始化

    // 如果域只在类的实例部分被访问，并且初始化这个域的开销很高，可能就值得进行延迟初始化

    // 当多个线程共享一个延迟初始化的域，采用某种形式的同步是非常重要的，否则就可能造成严重的bug

    // Normal initialization of an instance field
    private final Person perosn1 = init();

    private Person init() {

        return new Person(1,"Tom","man");
    }

    // Lazy initialization of instance field - synchronized accessor

    private Person person2;

    synchronized Person getPerson2() {
        if (person2 == null)
            person2 = init();
        return person2;
    }

    // 如果对静态域使用延迟初始化

    // lay initialization holder class idiom for static fields
    private static class FieldHolder {
        static final Person person = initStatic();
    }

    static Person getPerson() {
        return FieldHolder.person;
    }

    private static Person initStatic() {
        return new Person(1,"Tom","man");
    }

    //当第一次调用 getPerson()时，他读取 FieldHolder.person，导致 FieldHolder得到初始化
    // 魅力在于getPerson()没有被同步，并且只执行一个域访问，因此延迟初始化实际上并没有增加任何访成本

    // 需要对实例域延迟初始化，就使用双重检查模式
    // Double-check idiom for lazy initialization of instance fields

    private volatile Person field;

    Person getP() {

        Person result = field;
        if (result == null) {          //First check (no locking)
            synchronized (this) {
                result = field;
                if (result == null)    //Second check(with locking)
                    field= result=init();
            }
        }
        return result;
    }

    // Single-check idiom can case repeated initialization



}
