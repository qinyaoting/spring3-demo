package com.xyz.effect.chapter4.num16;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 5/19/14
 * Time: 3:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test16 {

    //16复合优先于继承

    // 包内使用继承是非常安全的，对于普通的具体类进行跨越包边界的继承是非常危险的

    //与方法调用不同的是，继承打破了封装性。子类依赖与其超类中特定功能的实现，超类的实现可能随着发行版本的不同而有变化
    //子类可以会遭到破坏，即使他的代码完全没有改变，除非超类是专门为了扩展二设计，并且具有很好的文档说明

    //不用扩展现有的类，而是在新类中增加一个私有域，他引用现在类的一个实例，这种设计叫 复合composition
    //现有的类变成了新类的一个组件，新类中的每一个实例方法都可以调用被包含的现有类实例对应的方法，并返回它的结果，这被称为转发
    //新类中的方法被称为转发方法，这样得到的类将非常稳固


    //当子类和超类之间存在子类型关系时，使用继承才是恰当的。即便如此，如果子类和超类不在同一包内，并且超类并不是为继承而设计的，
    //那么继承将会导致脆弱性
    //为了避免这种脆弱，可以使用复合和转发机制类代替继承，尤其是当存在适当的接口可以实现包装类的时候



    public static void main(String[] args) {

        InstrumentedHashSet<String> s =
                new InstrumentedHashSet<String>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));
    }
}
