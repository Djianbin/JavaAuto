package com.testng.groups;

import org.testng.annotations.Test;

/**
 * 依赖于xml文件运行
 * 这是一个类分组的注解
 * 将注解添加到类名上
 * @Test(groups = "类的分组名")
 */
@Test(groups = "student")
public class GroupsOnClassStudent01 {
    public void stu01(){
        System.out.println("这是一个学生组类GroupsOnClassStudent01中的方法stu01");
    }
    public void stu02(){
        System.out.println("这是一个学生组类GroupsOnClassStudent01中的方法stu02");

    }
}
