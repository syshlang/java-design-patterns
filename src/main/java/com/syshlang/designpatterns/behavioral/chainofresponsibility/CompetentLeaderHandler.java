/*
 * Copyright (c) 2023.
 * @File: CompetentLeaderHandler.java
 * @Description:
 * @Author: sunys
 * @Date: 2021/1/16 下午10:42
 * @since:
 */

package com.syshlang.designpatterns.behavioral.chainofresponsibility;

/**
 * @author : sunys
 * @version : v1.0
 * @createTime : 2021/1/16 20:39
 * @description :
 */
public class CompetentLeaderHandler extends LeaderHandler {
    public CompetentLeaderHandler(String name) {
        super(name);
    }

    @Override
    public void approval(Integer days) {
        if (days > 3) {
            System.out.println("--->请假" + days + "天，超过3天，由" + this.name + "审批通过--->");
        }
        LeaderHandler nextLeader = super.getNextLeader();
        if (null != nextLeader) {
            nextLeader.approval(days);
        }
    }
}
