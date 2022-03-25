package com.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.security.acl.Group;

/**
 * 这是在方法上分组的标签
 * groups = ”自定义分组名“
 * @BeforeGroups在分组前执行
 * @AfterGroups在分组后执行
 *
 */
public class GroupsOnMethod {
    @Test(groups = "servce")
    public void Test1(){
        System.out.println("这是测试servce组的方法1111");
    }
    @Test(groups = "servce")
    public void Test2(){
        System.out.println("这是测试servce组的方法22222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是测试client组的方法33333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是测试client组的方法44444");
    }
    @BeforeGroups("servce")
    public void beforGroupsServce(){
        System.out.println("这是在servce组方法前执行的方法");
    }
    @AfterGroups("servce")
    public void afterGroupsServce(){
        System.out.println("这是在servce组方法后执行的方法");
    }
    @BeforeGroups("client")
    public void beforGroupsClient(){
        System.out.println("这是在client组方法前执行的方法");
    }
    @AfterGroups("client")
    public void afterGroupsClient(){
        System.out.println("这是在client组方法后执行的方法");
    }
}
