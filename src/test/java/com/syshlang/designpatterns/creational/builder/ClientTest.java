package com.syshlang.designpatterns.creational.builder;

import org.junit.jupiter.api.Test;

/**
 * The type Client test.
 */
class ClientTest {

    /**
     * Client test.
     */
    @Test
    void clientTest() {
        System.out.println("Client call director");
        System.out.println("====================================");
        Client.builderTest();
        System.out.println("====================================");
    }
}