/*
 * Copyright (c) 2020.
 * @File: Client.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/17 下午5:19
 * @since:
 */

package com.syshlang.designpatterns.structural.adapter.objectadapter;

/**
 * The type Client.
 */
public class Client {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        VoltageAdapter voltageAdapter = new VoltageAdapter(new Source220V());
        voltageAdapter.outVoltage5v();
    }
}
