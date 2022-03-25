package com.testng;

import org.testng.annotations.*;

public class BasicAnnotation {
    @Test
    public void testCast01(){
        System.out.println("这是测试用例1");
    }
    @BeforeMethod
    public void testCastbefor(){
        System.out.println("test02这是在测试方法之前运行的BeforeMethod");
    }
    @AfterMethod
    public void testAfter(){
        System.out.println("testafter03这是在测试方法之后运行的AfterMethod");
    }
    @Test
    public void testCast02(){
        System.out.println("这是测试用例2");
    }
    @BeforeClass
    public void beforeClasstest(){
        System.out.println("这是在class类运行前运行的方法BeforeClass");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite标签执行套件测试AfterSuite");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite标签执行套件测试BeforeSuite");
    }
}
