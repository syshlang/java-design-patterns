/*
 * Copyright (c) 2019.
 * @File: LazyThreadUnsafe.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/9/17 下午11:39
 * @since:
 */

package com.syshlang.designpatterns.creational.singleton;

/**
 * @author sunys
 */
public class LazyThreadUnsafe {
    /**
     * 构造器私有化,防止new
     */
    private LazyThreadUnsafe() {
    }
    private static LazyThreadUnsafe instance;

    /**
     * 提供一个静态的公有方法，当使用到该方法时，才去实例化instance
     * @return
     */
    public static LazyThreadUnsafe getInstance() {
        if (instance == null){
            instance = new LazyThreadUnsafe();
        }
        return instance;
    }
}
