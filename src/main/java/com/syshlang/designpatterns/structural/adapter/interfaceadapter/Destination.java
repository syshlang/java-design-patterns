/*
 * Copyright (c) 2020.
 * @File: Destination5V.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/17 下午4:23
 * @since:
 */

package com.syshlang.designpatterns.structural.adapter.interfaceadapter;

public interface Destination {
    /**
     *
     * @return
     */
    int outVoltage5v();

    /**
     * @return
     */
    int outVoltage10v();

    /**
     * @return
     */
    int outVoltage36v();

    /**
     * @return
     */
    int outVoltage220v();
}
