package com.testng.suite;

import org.testng.annotations.Test;

/**
 * 忽略测试
 * @Test(enabled = false)表示不执行
 * @Test(enabled = ture)表示执行  默认表示执行
 */
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("IgnoreTest执行测试1");
    }
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("忽略该测试用例，不执行");
    }
}
