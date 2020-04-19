package com.syshlang.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Lazy thread safe sync method test.
 */
class LazyThreadSafeSyncMethodTest {

    /**
     * Gets instance.
     */
    @Test
    void getInstance() {
        System.out.println("Get instance by lazy thread safe sync method");
        System.out.println("====================================");
        LazyThreadSafeSyncMethod instance1 = LazyThreadSafeSyncMethod.getInstance();
        System.out.println("instance1————>"+instance1);
        LazyThreadSafeSyncMethod instance2 = LazyThreadSafeSyncMethod.getInstance();
        System.out.println("instance2————>"+instance2);
        boolean same = instance1 == instance2;
        System.out.println("instance1 == instance2:"+ same);
        System.out.println("====================================");
    }
}