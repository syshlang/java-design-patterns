package com.syshlang.designpatterns.chainofresponsibility;


import com.syshlang.designpatterns.behavioral.chainofresponsibility.Client;
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
        //请假小于3天
        Client.approvalTest(2);
        System.out.println("====================================");
        //请假大于3天
        Client.approvalTest(5);
        System.out.println("====================================");
    }
}