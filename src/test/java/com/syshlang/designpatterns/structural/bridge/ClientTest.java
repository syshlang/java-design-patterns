/*
 * Copyright (c) 2020.
 * @File: ClientTest.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/10/21 下午12:26
 * @since:
 */

package com.syshlang.designpatterns.structural.bridge;


import org.junit.jupiter.api.Test;

class ClientTest {
    @Test
    void clientTest() {
        System.out.println("Client call bridge");
        System.out.println("====================================");
        Client.bridgeTest();
        System.out.println("====================================");
    }
}