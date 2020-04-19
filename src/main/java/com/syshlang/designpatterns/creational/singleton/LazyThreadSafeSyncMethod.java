/*
 * Copyright (c) 2019.
 * @File: LazyThreadSafeSyncMethod.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/9/17 下午11:53
 * @since:
 */

package com.syshlang.designpatterns.creational.singleton;

/**
 * The type Lazy thread safe sync method.
 *
 * @author sunys
 */
public class LazyThreadSafeSyncMethod {
    /**
     * 构造器私有化,防止new
     */
    private LazyThreadSafeSyncMethod() {
    }
    private static LazyThreadSafeSyncMethod instance;

    /**
     * 提供一个静态的公有方法，对方法加入同步锁，解决线程安全问题
     *
     * @return instance instance
     */
    public static synchronized LazyThreadSafeSyncMethod getInstance() {
        if (instance == null){
            instance = new LazyThreadSafeSyncMethod();
        }
        return instance;
    }
}
