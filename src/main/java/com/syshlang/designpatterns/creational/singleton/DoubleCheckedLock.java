/*
 * Copyright (c) 2019.
 * @File: DoubleCheckedLock.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/9/18 上午12:09
 * @since:
 */

package com.syshlang.designpatterns.creational.singleton;

/**
 * @author sunys
 */
public class DoubleCheckedLock {
    /**
     * 构造器私有化,防止new
     */
    private DoubleCheckedLock() {
    }
    private static volatile DoubleCheckedLock instance;

    /**
     * 提供一个静态的公有方法，加入双重检查代码和同步锁，解决线程安全问题,同时解决懒加载问题
     * @return
     */
    public static DoubleCheckedLock getInstance() {
        if (instance == null){
            synchronized (DoubleCheckedLock.class){
                if (instance == null){
                    instance = new DoubleCheckedLock();
                }
            }
        }
        return instance;
    }
}
