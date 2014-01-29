package com.baobaotao.junit;

import org.aspectj.weaver.patterns.ParserException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: vuclip123
 * Date: 1/25/14
 * Time: 8:58 AM
 * To change this template use File | Settings | File Templates.
 */

// 1 为参数化测试类用 @RunWith注释指定特殊的运行器 Parameterized.class
@RunWith(Parameterized.class)
public class Junit4ParameterTest {

    // 2在测试类中声明几个变量，分别用于存储期望值和测试的数据，并创建一个带构造器的函数
    private SimpleDateFormat simpleDateFormat;
    private String date;
    private String dateformat;
    private String expectedDate;

    public Junit4ParameterTest(String date, String dateformat, String expectedDate) {
        this.date = date;
        this.dateformat = dateformat;
        this.expectedDate = expectedDate;
    }

    // 3 创建一个静态测试数据（feed），其返回类型年月年为Collection，并加@Parameterized.Parameters
    @Parameterized.Parameters
    @SuppressWarnings("unchecked")
    public static Collection getParamters() {
        String[][] object = {
                {"2011-07-01 00:30:59","yyyyMMdd","20110701"},
                {"2011-07-01 00:30:59","yy青MM月dd日","2011 nian 07 yue 01 ri"},
                {"2011-07-01 00:30:59","HHmmss","003059"}

        };
        return Arrays.asList(object);
    }

    //4编写测试方法
    @Test
    public void testSimpleDateFormat() throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        Date d = df.parse(this.date);
        simpleDateFormat = new SimpleDateFormat(this.dateformat);
        String result = simpleDateFormat.format(d);
        assertEquals(this.expectedDate,result);
    }

    //测试运行器

}
