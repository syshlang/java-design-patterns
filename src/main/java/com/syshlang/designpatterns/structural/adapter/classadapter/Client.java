/*
 * Copyright (c) 2020.
 * @File: Client.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/17 下午4:56
 * @since:
 */

package com.syshlang.designpatterns.structural.adapter.classadapter;

public class Client {
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        voltageAdapter.outVoltage5v();
    }
}
