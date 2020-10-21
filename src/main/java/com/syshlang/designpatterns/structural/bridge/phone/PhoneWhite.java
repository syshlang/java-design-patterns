/*
 * Copyright (c) 2020.
 * @File: PhoneWhite.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/10/21 下午12:09
 * @since:
 */

package com.syshlang.designpatterns.structural.bridge.phone;

import com.syshlang.designpatterns.structural.bridge.brand.PhoneBrand;

/**
 * The type Phone white.
 *
 * @author sunys
 */
public class PhoneWhite extends Phone{
    /**
     * Instantiates a new Phone white.
     *
     * @param phoneBrand the phone brand
     */
    public PhoneWhite(PhoneBrand phoneBrand) {
        super(phoneBrand);
    }

    @Override
    public void call() {
        super.call();
        System.out.println("The phone of call is White.");
    }

    @Override
    public void sendMessage() {
        super.sendMessage();
        System.out.println("The phone of sendMessage is White.");
    }

    @Override
    public void goOnline() {
        super.goOnline();
        System.out.println("The phone of goOnline is White.");
    }
}
