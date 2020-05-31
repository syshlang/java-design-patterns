package com.syshlang.designpatterns.structural.adapter.interfaceadapter;

import org.junit.jupiter.api.Test;

class VoltageAdapterTest {

    @Test
    void interfaceAdapter(){
        System.out.println("Interface  adapter");
        System.out.println("====================================");
        VoltageAdapter voltageAdapter = new VoltageAdapter();
        int voltage5v = voltageAdapter.outVoltage5v();
        System.out.println(voltage5v);
        System.out.println("====================================");
    }
}