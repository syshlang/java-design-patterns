/*
 * Copyright (c) 2020.
 * @File: Client.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/17 下午5:19
 * @since:
 */

package com.syshlang.designpatterns.structural.adapter.objectadapter;

public class Client {
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter = new VoltageAdapter(new Source220V());
        voltageAdapter.outVoltage5v();
    }
}
