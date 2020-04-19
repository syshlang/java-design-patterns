package com.syshlang.designpatterns.creational.singleton;

import org.junit.jupiter.api.Test;

/**
 * The type Hungry static constants test.
 */
class HungryStaticConstantsTest {

    /**
     * Gets instance.
     */
    @Test
    void getInstance() {
        System.out.println("Get instance by hungry static constants");
        System.out.println("====================================");
        HungryStaticConstants instance1 = HungryStaticConstants.getInstance();
        System.out.println("instance1————>"+instance1);
        HungryStaticConstants instance2 = HungryStaticConstants.getInstance();
        System.out.println("instance2————>"+instance2);
        boolean same = instance1 == instance2;
        System.out.println("instance1 == instance2:"+ same);
        System.out.println("====================================");
    }
}