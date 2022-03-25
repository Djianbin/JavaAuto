package com.testng.groups;

import org.testng.annotations.Test;

/**
 * 对类进行分组执行测试
 * 需要在类名上添加 @Test(groups = "分组名")
 */
@Test(groups = "student")
public class GroupsOnClassStudent02 {
    public void stu01(){
        System.out.println("这是一个学生类分组GroupsOnClassStudent02中的方法stu01");
    }
    public void stu02(){
        System.out.println("这是一个学生类分组GroupsOnClassStudent02中的方法stu02");
    }
}
