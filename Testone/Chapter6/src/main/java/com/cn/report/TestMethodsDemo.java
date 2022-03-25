package com.cn.report;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {
    @Test
    public void test1(){
        //判断对此
        Assert.assertEquals(1,2);

        //System.out.println("这是第个yi测试用例判断对错是否相同  不同");
    }
    @Test
    public void test2(){
        Assert.assertEquals(1,1);
        //System.out.println("这是第二个测试用例判断对错是否相同   相同");
    }
    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void logDemo(){
        Reporter.log("这是我们自己写的日志");
        throw new RuntimeException("这是我自己运行时的异常");
    }
}
