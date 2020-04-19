package com.syshlang.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

/**
 * The type Double checked lock test.
 */
class DoubleCheckedLockTest {

    /**
     * Gets instance.
     */
    @Test
    void getInstance() {
        System.out.println("Get instance by double checked lock");
        System.out.println("====================================");
        DoubleCheckedLock instance1 = DoubleCheckedLock.getInstance();
        System.out.println("instance1————>"+instance1);
        DoubleCheckedLock instance2 = DoubleCheckedLock.getInstance();
        System.out.println("instance2————>"+instance2);
        boolean same = instance1 == instance2;
        System.out.println("instance1 == instance2:"+ same);
        System.out.println("====================================");
    }
}