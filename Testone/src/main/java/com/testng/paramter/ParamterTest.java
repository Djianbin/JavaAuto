package com.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * 参数化测试
 * 依赖于xml文件进行
 */
public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramter(String name,int age){
        System.out.println("name = "+ name+";  age ="+age);
    }
}
