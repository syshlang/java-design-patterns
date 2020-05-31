package com.syshlang.designpatterns.structural.adapter.classadapter;

import org.junit.jupiter.api.Test;

/**
 * The type Voltage adapter test.
 */
class VoltageAdapterTest {

    /**
     * Class adapter.
     */
    @Test
    void classAdapter(){
        System.out.println("Class  adapter");
        System.out.println("====================================");
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        int voltage5v = voltageAdapter.outVoltage5v();
        System.out.println(voltage5v);
        System.out.println("====================================");
    }
}