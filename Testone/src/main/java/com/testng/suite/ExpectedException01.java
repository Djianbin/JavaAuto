package com.testng.suite;

import org.testng.annotations.Test;

/**
 * 异常测试
 * 在期望结果为某个异常的时候会用到异常测试
 * @Test 属性 expectedExceptions
 */
public class ExpectedException01 {
    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
    }
    //这是一个测试结果会成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionScuccess(){
        System.out.println("这是一个执行成功的异常测试");
        throw new RuntimeException();
    }
}
