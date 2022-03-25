package com.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * 参数化测试   对象
 * 两种方式 其一：对象
 * 不需要xml  直接通过方法传递参数
 * @DataProvider(name = "data")
 * @Test(dataProvider = "data")
 */
public class DateProviderTest {
    @Test(dataProvider = "data")
    public void testdateProvider(String name,int age){
        System.out.println("name = "+ name+";  age ="+age);
    }
    //和上面的属性名称保持一致 dataProvider
    @DataProvider(name = "data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"张三",20},
                {"里斯",30}
        };
        return o;
    }
    @Test(dataProvider = "mothodData")
    public void test1(String name,int age){
        System.out.println("这是test1111的运行参数  name"+name+"; age="+age);
    }
    @Test(dataProvider = "mothodData")
    public void test2(String name,int age){
        System.out.println("这是test2222的运行参数  name"+name+"; age="+age);
    }
    //需要在test1 test2方法中传递的参数
    @DataProvider(name ="mothodData" )
    public Object[][] mothodData(Method mothod){
        //根据不同的方法为result赋值
        Object [][] result = null;
        if (mothod.getName().equals("test1")){
                result = new Object[][]{
                        {"tes1王五",50},
                        {"test赵六",60}
                };
        }else if (mothod.getName().equals("test2")){
                result = new Object[][]{
                        {"TEST2WANG",70},
                        {"TEST2ZHOU",80}
                };
        }
        return result;
    }
}
