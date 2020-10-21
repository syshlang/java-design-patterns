/*
 * Copyright (c) 2020.
 * @File: Phone.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/10/21 上午11:39
 * @since:
 */

package com.syshlang.designpatterns.structural.bridge.phone;

import com.syshlang.designpatterns.structural.bridge.brand.PhoneBrand;

/**
 * @author sunys
 * 手机抽象类 相当于“桥”
 */
public abstract class Phone {

    /**
     * PhoneBrand 类聚合
     */
    private PhoneBrand phoneBrand;

    public Phone(PhoneBrand phoneBrand) {
        super();
        this.phoneBrand = phoneBrand;
    }

    protected void call() {
        this.phoneBrand.call();
    }


    protected void sendMessage() {
        this.phoneBrand.sendMessage();
    }

    protected void goOnline() {
        this.phoneBrand.goOnline();
    }
}
