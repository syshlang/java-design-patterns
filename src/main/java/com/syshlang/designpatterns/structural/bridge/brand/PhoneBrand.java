/*
 * Copyright (c) 2020.
 * @File: PhoneBrand.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/10/21 上午11:37
 * @since:
 */

package com.syshlang.designpatterns.structural.bridge.brand;

/**
 * 手机品牌接口
 *
 * @author sunys
 */
public interface PhoneBrand {
    /**
     * Call.
     * 打电话
     */
    void call();

    /**
     * Send message.
     * 发短信
     */
    void sendMessage();

    /**
     * Go online.
     * 上网
     */
    void goOnline();
}
