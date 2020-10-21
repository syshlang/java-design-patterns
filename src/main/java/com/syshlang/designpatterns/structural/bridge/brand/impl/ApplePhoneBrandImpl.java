/*
 * Copyright (c) 2020.
 * @File: ApplePhoneBrandImpl.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/10/21 上午11:38
 * @since:
 */

package com.syshlang.designpatterns.structural.bridge.brand.impl;

import com.syshlang.designpatterns.structural.bridge.brand.PhoneBrand;

/**
 * @author sunys
 * Apple品牌接口实现
 */
public class ApplePhoneBrandImpl implements PhoneBrand {
    @Override
    public void call() {
        System.out.println("Call use Apple phone.");
    }

    @Override
    public void sendMessage() {
        System.out.println("SendMessage use Apple phone.");
    }

    @Override
    public void goOnline() {
        System.out.println("GoOnline use Apple phone.");
    }
}
