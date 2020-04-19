/*
 * Copyright (c) 2020.
 * @File: Adapter5V.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/17 下午4:22
 * @since:
 */

package com.syshlang.designpatterns.structural.adapter.objectadapter;

import com.syshlang.designpatterns.structural.adapter.classadapter.Destination5V;

/**
 * The type Voltage adapter.
 *
 * @author sunys
 */
public class VoltageAdapter  implements Destination5V{
    /**
     * 直接持有需要被适配的类（Source）
     */
    private Source220V source220V;

    /**
     * Instantiates a new Voltage adapter.
     *
     * @param source220V the source 220 v
     */
    public VoltageAdapter(Source220V source220V) {
        this.source220V = source220V;
    }

    @Override
    public int outVoltage5v() {
        int voltage220v = source220V.outVoltage220v();
        return voltage220v/44;
    }
}
