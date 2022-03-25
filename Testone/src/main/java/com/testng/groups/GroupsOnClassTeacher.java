package com.testng.groups;

import org.testng.annotations.Test;

/**
 * 对类进行分组执行测试
 * 需要在类名上添加 @Test(groups = "分组名")
 * 需要在xml文件中定义标签执行
 */
@Test(groups = "teacher")
public class GroupsOnClassTeacher {
    public void teacher01(){
        System.out.println("这是一个教师组类GroupsOnClassTeacher中的方法teacher01");
    }
    public void teacher02(){
        System.out.println("这是一个教师组类GroupsOnClassTeacher中的方法teacher01");

    }
}
