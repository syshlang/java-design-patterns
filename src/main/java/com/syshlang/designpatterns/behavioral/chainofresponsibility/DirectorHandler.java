/*
 * Copyright (c) 2023.
 * @File: DirectorHandler.java
 * @Description:
 * @Author: sunys
 * @Date: 2021/1/16 下午10:42
 * @since:
 */

package com.syshlang.designpatterns.behavioral.chainofresponsibility;

/**
 * @author : sunys
 * @version : v1.0
 * @createTime : 2021/1/16 20:18
 * @description : 主任具体处理者
 */
public class DirectorHandler extends LeaderHandler {
    public DirectorHandler(String name) {
        super(name);
    }

    @Override
    public void approval(Integer days) {
        System.out.println("--->请假" + days + "天，由" + this.name + "审批通过--->");
        LeaderHandler nextLeader = super.getNextLeader();
        if (null != nextLeader) {
            nextLeader.approval(days);
        }
    }
}
