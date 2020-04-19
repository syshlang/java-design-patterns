/*
 * Copyright (c) 2020.
 * @File: Destination5V.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/17 下午4:23
 * @since:
 */

package com.syshlang.designpatterns.structural.adapter.interfaceadapter;

/**
 * The interface Destination.
 */
public interface Destination {
    /**
     * Out voltage 5 v int.
     *
     * @return int int
     */
    int outVoltage5v();

    /**
     * Out voltage 10 v int.
     *
     * @return int int
     */
    int outVoltage10v();

    /**
     * Out voltage 36 v int.
     *
     * @return int int
     */
    int outVoltage36v();

    /**
     * Out voltage 220 v int.
     *
     * @return int int
     */
    int outVoltage220v();
}
