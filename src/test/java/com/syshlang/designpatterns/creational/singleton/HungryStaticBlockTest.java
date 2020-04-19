package com.syshlang.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

/**
 * The type Hungry static block test.
 */
class HungryStaticBlockTest {

    /**
     * Gets instance.
     */
    @Test
    void getInstance() {
        System.out.println("Get instance by hungry static block");
        System.out.println("====================================");
        HungryStaticBlock instance1 = HungryStaticBlock.getInstance();
        System.out.println("instance1————>"+instance1);
        HungryStaticBlock instance2 = HungryStaticBlock.getInstance();
        System.out.println("instance2————>"+instance2);
        boolean same = instance1 == instance2;
        System.out.println("instance1 == instance2:"+ same);
        System.out.println("====================================");
    }
}