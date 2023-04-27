/*
 * Copyright (c) 2020.
 * @File: HuaWeiPhoneBrandImpl.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/10/21 上午11:38
 * @since:
 */

package com.syshlang.designpatterns.structural.bridge.brand.impl;

import com.syshlang.designpatterns.structural.bridge.brand.PhoneBrand;

/**
 * @author sunys
 * HuaWei品牌接口实现
 */
public class HuaWeiPhoneBrandImpl implements PhoneBrand {
    @Override
    public void call() {
        System.out.println("Call use HuaWei phone.");
    }

    @Override
    public void sendMessage() {
        System.out.println("SendMessage use HuaWei phone.");
    }

    @Override
    public void goOnline() {
        System.out.println("GoOnline use HuaWei phone.");
    }
}
