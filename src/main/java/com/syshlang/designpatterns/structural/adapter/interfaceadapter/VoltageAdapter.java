/*
 * Copyright (c) 2020.
 * @File: Adapter5V.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/17 下午4:22
 * @since:
 */

package com.syshlang.designpatterns.structural.adapter.interfaceadapter;

/**
 * @author sunys
 */
public class VoltageAdapter extends AbstractVoltageAdapter{
    @Override
    public int outVoltage5v() {
        int voltage220v = outVoltage220v();
        return voltage220v/44;
    }
}
