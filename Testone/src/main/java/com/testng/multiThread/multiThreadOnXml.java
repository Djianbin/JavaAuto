package com.testng.multiThread;

import org.testng.annotations.Test;

/**
 * 通过配置xml进行多线程测试
 */
public class multiThreadOnXml {
    @Test
    public void test1(){
        System.out.printf("查看线程ID  Thread ID : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test2(){
        System.out.printf("查看线程ID  Thread ID : %s%n",Thread.currentThread().getId());
    }
    @Test
    public void test3(){
        System.out.printf("查看线程ID  Thread ID : %s%n",Thread.currentThread().getId());

    }
}
