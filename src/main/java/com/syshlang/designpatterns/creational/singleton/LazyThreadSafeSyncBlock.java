/*
 * Copyright (c) 2019.
 * @File: LazyThreadSafeSyncBlock.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/9/17 下午11:53
 * @since:
 */

package com.syshlang.designpatterns.creational.singleton;

/**
 * @author sunys
 */
public class LazyThreadSafeSyncBlock {
    /**
     * 构造器私有化,防止new
     */
    private LazyThreadSafeSyncBlock() {
    }
    private static LazyThreadSafeSyncBlock instance;

    /**
     * 提供一个静态的公有方法，对代码块加入同步锁，解决线程安全问题
     * @return
     */
    public static LazyThreadSafeSyncBlock getInstance() {
        if (instance == null){
            synchronized (LazyThreadSafeSyncBlock.class){
                instance = new LazyThreadSafeSyncBlock();
            }
        }
        return instance;
    }
}
