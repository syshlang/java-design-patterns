/*
 * Copyright (c) 2020.
 * @File: PhoneBlack.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/10/21 下午12:10
 * @since:
 */

package com.syshlang.designpatterns.structural.bridge.phone;

import com.syshlang.designpatterns.structural.bridge.brand.PhoneBrand;

/**
 * The type Phone black.
 * @author sunys
 */
public class PhoneBlack extends Phone{
    /**
     * Instantiates a new Phone black.
     *
     * @param phoneBrand the phone brand
     */
    public PhoneBlack(PhoneBrand phoneBrand) {
        super(phoneBrand);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("The phone of call is Black.");
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("The phone of sendMessage is Black.");
    }

    @Override
    public void goOnline() {
        super.goOnline();
        System.out.println("The phone of goOnline is Black.");
    }
}
