/*
 * Copyright (c) 2020.
 * @File: Client.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/17 下午4:56
 * @since:
 */

package com.syshlang.designpatterns.structural.adapter.classadapter;

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
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        voltageAdapter.outVoltage5v();
    }
}
