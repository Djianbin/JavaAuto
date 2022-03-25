package com.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * 写套件之前运行的方法
 * 一些共有的
 */

public class SutieConfig {
    @BeforeSuite
    public void beforeSuit(){
        System.out.println("before Suit运行啦");
    }
    @AfterSuite
    public void afterSuit(){
        System.out.println("after Suit运行啦");
    }
    @BeforeTest
    public void beforTest(){
        System.out.println("befor Test");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("after Test");
    }
}
