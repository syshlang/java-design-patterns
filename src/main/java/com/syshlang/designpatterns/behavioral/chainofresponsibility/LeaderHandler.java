/*
 * Copyright (c) 2023.
 * @File: LeaderHandler.java
 * @Description:
 * @Author: sunys
 * @Date: 2021/1/16 下午10:42
 * @since:
 */

package com.syshlang.designpatterns.behavioral.chainofresponsibility;

/**
 * @author : sunys
 * @version : v1.0
 * @createTime : 2021/1/16 20:08
 * @description : 抽象领导处理者
 */
public abstract class LeaderHandler {
    private LeaderHandler nextLeader;
    protected String name;

    public LeaderHandler(String name) {
        this.name = name;
    }

    public LeaderHandler getNextLeader() {
        return nextLeader;
    }

    public void setNextLeader(LeaderHandler nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 抽象审批处理方法
     *
     * @param days 请假天数
     */
    public abstract void approval(Integer days);
}
