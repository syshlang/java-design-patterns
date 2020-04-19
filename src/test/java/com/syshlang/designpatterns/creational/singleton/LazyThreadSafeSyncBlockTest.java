package com.syshlang.designpatterns.creational.singleton;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Lazy thread safe sync block test.
 */
class LazyThreadSafeSyncBlockTest {

    /**
     * Gets instance.
     */
    @Test
    void getInstance() {
        System.out.println("Get instance by lazy thread safe sync block");
        System.out.println("====================================");
        LazyThreadSafeSyncBlock instance1 = LazyThreadSafeSyncBlock.getInstance();
        System.out.println("instance1————>"+instance1);
        LazyThreadSafeSyncBlock instance2 = LazyThreadSafeSyncBlock.getInstance();
        System.out.println("instance2————>"+instance2);
        boolean same = instance1 == instance2;
        System.out.println("instance1 == instance2:"+ same);
        System.out.println("====================================");
    }
}