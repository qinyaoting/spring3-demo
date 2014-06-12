package com.xyz.effect.chapter3.num9;

/**
 * Created with IntelliJ IDEA.
 * User: qinyaoting
 * Date: 6/12/14
 * Time: 9:15 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneNumber {

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumber(int areaCode, int prefix, int lineNumber) {

        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");
        this.areaCode = (short)areaCode;
        this.prefix = (short)prefix;
        this.lineNumber = (short)lineNumber;
    }

    private static void rangeCheck(int arg, int max, String name) {

        if (arg<0 || arg > max)
            throw new IllegalArgumentException(name +":"+ arg);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn  = (PhoneNumber) o;
        return pn.lineNumber == lineNumber
                && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }


    // Broken - no hashCode method!


    @Override
    public int hashCode() {
        // 为什么这么做
        int result = 17;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + lineNumber;
        return result;
    }

    // 如果域是boolean类型，则计算(f?1:0)
    // 如果域是byte char short 或者int，则计算(int)f
    // 如果是long 则 (int)(f^(f>>>32))
    // 如果是float，则 Float.floatToIntBits(f)
    // 如果是double，则Double.doubleToLongBits(f) 然后按long继续
    // 如果域是一个引用
    // 如果域是一个数组
}
