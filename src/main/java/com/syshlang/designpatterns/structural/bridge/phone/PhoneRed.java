/*
 * Copyright (c) 2020.
 * @File: PhoneRed.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/10/21 下午12:07
 * @since:
 */

package com.syshlang.designpatterns.structural.bridge.phone;

import com.syshlang.designpatterns.structural.bridge.brand.PhoneBrand;

/**
 * The type Phone red.
 *
 * @author sunys
 */
public class PhoneRed extends Phone{
    /**
     * Instantiates a new Phone red.
     *
     * @param phoneBrand the phone brand
     */
    public PhoneRed(PhoneBrand phoneBrand) {
        super(phoneBrand);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("The phone of call is Red.");
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("The phone of sendMessage is Red.");
    }

    @Override
    public void goOnline() {
        super.goOnline();
        System.out.println("The phone of goOnline is Red.");
    }
}
