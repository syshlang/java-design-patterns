/*
 * Copyright (c) 2020.
 * @File: VoltageAdapter.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/17 下午5:38
 * @since:
 */

package com.syshlang.designpatterns.structural.adapter.interfaceadapter;

/**
 * @author sunys
 */
public  abstract class AbstractVoltageAdapter implements Destination{
    @Override
    public int outVoltage5v() {
        return 5;
    }

    @Override
    public int outVoltage10v() {
        return 10;
    }

    @Override
    public int outVoltage36v() {
        return 36;
    }

    @Override
    public int outVoltage220v() {
        return 220;
    }
}
