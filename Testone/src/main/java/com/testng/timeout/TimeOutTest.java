package com.testng.timeout;
import org.testng.annotations.Test;

import java.lang.management.ThreadInfo;

/**
 * 超时测试 timeout
 */
public class TimeOutTest {
    @Test(timeOut = 3000)//设置超时时间 单位毫秒
    public void testsSuccess() throws InterruptedException {
        //休眠时间
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)//超过2000毫秒出现超时  失败
    public void testFailde() throws InterruptedException {
        Thread.sleep(3000);
    }
}
