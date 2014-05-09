package com.baobaotao.junit;

import com.google.common.base.Optional;
import com.google.common.base.Throwables;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/25/14
 * Time: 9:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class ThrowablesTest {

    // 可以简单地捕获和重新抛出多个异常
    @Test
    public void testThrowables(){
        try {
            throw new Exception();
        } catch (Throwable t) {
            String ss = Throwables.getStackTraceAsString(t);
            System.out.println("ss:"+ss);
            Throwables.propagate(t);
        }
    }

    @Test
    public void call() throws IOException {
        try {
            throw new IOException();
        } catch (Throwable t) {
            Throwables.propagateIfInstanceOf(t, IOException.class);
            throw Throwables.propagate(t);
        }
    }

    // 将检查异常转换成未检查异常,例如：
    @Test
    public void testCheckException(){
        try {
            URL url = new URL("http://ociweb.com");
            final InputStream in = url.openStream();
            // read from the input stream
            in.close();
        } catch (Throwable t) {
            throw Throwables.propagate(t);
        }
    }


    /**
     * 传递异常的常用方法：

     　　1.RuntimeException propagate(Throwable)：把throwable包装成RuntimeException，用该方法保证异常传递，抛出一个RuntimeException异常
     　　2.void propagateIfInstanceOf(Throwable, Class<X extends Exception>) throws X：当且仅当它是一个X的实例时，传递throwable
     　　3.void propagateIfPossible(Throwable)：当且仅当它是一个RuntimeException和Error时，传递throwable
     　　4.void propagateIfPossible(Throwable, Class<X extends Throwable>) throws X：当且仅当它是一个RuntimeException和Error时，或者是一个X的实例时，传递throwable。
     */
}
