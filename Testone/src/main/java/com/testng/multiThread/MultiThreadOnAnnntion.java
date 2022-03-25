package com.testng.multiThread;

import org.testng.annotations.Test;

/**
 * 多线程执行测试
 * 通过注解进行多线程控制
 * 注解：进行多线程测试
 */
public class MultiThreadOnAnnntion {
    //invocationCount 表示线程数
    //threadPoolSize 表示线程池
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test1(){
        System.out.println(1);
        System.out.printf("查看线程ID  Thread ID : %s%n",Thread.currentThread().getId());
    }
}
