package com.syshlang.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Lazy thread unsafe test.
 */
class LazyThreadUnsafeTest {

    /**
     * Gets instance.
     */
    @Test
    void getInstance() {
        System.out.println("Get instance by lazy thread unsafe");
        System.out.println("====================================");
        LazyThreadUnsafe instance1 = LazyThreadUnsafe.getInstance();
        System.out.println("instance1————>"+instance1);
        LazyThreadUnsafe instance2 = LazyThreadUnsafe.getInstance();
        System.out.println("instance2————>"+instance2);
        boolean same = instance1 == instance2;
        System.out.println("instance1 == instance2:"+ same);
        System.out.println("====================================");
    }
}