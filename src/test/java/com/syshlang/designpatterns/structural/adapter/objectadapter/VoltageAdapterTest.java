package com.syshlang.designpatterns.structural.adapter.objectadapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VoltageAdapterTest {

    @Test
    void objectAdapter(){
        System.out.println("Object  adapter");
        System.out.println("====================================");
        VoltageAdapter voltageAdapter = new VoltageAdapter(new Source220V());
        int voltage5v = voltageAdapter.outVoltage5v();
        System.out.println(voltage5v);
        System.out.println("====================================");
    }
}