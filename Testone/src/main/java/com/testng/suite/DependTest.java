package com.testng.suite;

import org.testng.annotations.Test;

/**
 * 依赖测试
 * 方法二依赖于方法一执行
 * 执行方法二时，方法一被动执行.方法一失败后，方法二会被忽略不执行
 * 属性
 * @Test(dependsOnMethods = "方法名")
 * @Test(dependsOnGroups = "组名")
 */
public class DependTest {
    @Test
    public void runTest1(){
        System.out.println("runtest1 run1");
    }
    @Test(dependsOnMethods = "runTest1")
    public void runTest2(){
        System.out.println("runtest2 run2");
    }
}
