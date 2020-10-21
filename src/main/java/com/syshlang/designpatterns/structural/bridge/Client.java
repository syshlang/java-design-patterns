/*
 * Copyright (c) 2020.
 * @File: Client.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/10/21 上午11:33
 * @since:
 */

package com.syshlang.designpatterns.structural.bridge;

import com.syshlang.designpatterns.structural.bridge.brand.impl.HuaWeiPhoneBrandImpl;
import com.syshlang.designpatterns.structural.bridge.brand.impl.XiaoMiPhoneBrandImpl;
import com.syshlang.designpatterns.structural.bridge.phone.PhoneBlack;
import com.syshlang.designpatterns.structural.bridge.phone.PhoneRed;
import com.syshlang.designpatterns.structural.bridge.phone.PhoneWhite;

/**
 * The type Client.
 *
 * @author sunys
 */
public class Client {
    /**
     * Bridge test.
     */
    public static void bridgeTest() {
        PhoneRed phoneRed = new PhoneRed(new HuaWeiPhoneBrandImpl());
        phoneRed.call();
        phoneRed.sendMessage();
        phoneRed.goOnline();
        PhoneBlack phoneBlack = new PhoneBlack(new HuaWeiPhoneBrandImpl());
        phoneBlack.call();
        phoneBlack.sendMessage();
        phoneBlack.goOnline();
        PhoneWhite phoneWhite = new PhoneWhite(new XiaoMiPhoneBrandImpl());
        phoneWhite.call();
        phoneWhite.sendMessage();
        phoneWhite.goOnline();
    }
}
