/*
 * Copyright (c) 2023.
 * @File: Client.java
 * @Description:
 * @Author: sunys
 * @Date: 2021/1/16 下午10:05
 * @since:
 */

package com.syshlang.designpatterns.behavioral.chainofresponsibility;


/**
 * @author : sunys
 * @version : v1.0
 * @createTime : 2021/1/16 20:05
 * @description :
 */
public class Client {

    public static void approvalTest(Integer days) {
        //组装责任链
        DirectorHandler directorHandler = new DirectorHandler("部门侯主任");
        DepartmentManagerHandler departmentManagerHandler = new DepartmentManagerHandler("部门吴经理");
        ResourcesManagerHandler resourcesManagerHandler = new ResourcesManagerHandler("人力资源王经理");
        CompetentLeaderHandler competentLeaderHandler = new CompetentLeaderHandler("主管领导老王");

        directorHandler.setNextLeader(departmentManagerHandler);
        departmentManagerHandler.setNextLeader(resourcesManagerHandler);
        resourcesManagerHandler.setNextLeader(competentLeaderHandler);
        //提交请求
        directorHandler.approval(days);
        System.out.println("流程审批结束");
    }
}
