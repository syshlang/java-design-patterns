package com.syshlang.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Static internal class test.
 */
class StaticInternalClassTest {

    /**
     * Gets instance.
     */
    @Test
    void getInstance() {
        System.out.println("Get instance by static internal class");
        System.out.println("====================================");
        StaticInternalClass instance1 = StaticInternalClass.getInstance();
        System.out.println("instance1————>"+instance1);
        StaticInternalClass instance2 = StaticInternalClass.getInstance();
        System.out.println("instance2————>"+instance2);
        boolean same = instance1 == instance2;
        System.out.println("instance1 == instance2:"+ same);
        System.out.println("====================================");
    }
}