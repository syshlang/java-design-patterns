/*
 * Copyright (c) 2019.
 * @File: StaticInternalClass.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/9/18 上午12:26
 * @since:
 */

package com.syshlang.designpatterns.creational.singleton;

/**
 * @author sunys
 */
public class StaticInternalClass {
    /**
     * 构造器私有化,防止new
     */
    private StaticInternalClass() {
    }

    /**
     * 提供一个静态内部类,
     * 该类中有一个静态属性StaticInternalClass
     */
    private static class SingletonHolder {
        private static final StaticInternalClass INSTANCE = new StaticInternalClass();
    }

    /**
     * 提供一个静态的公有方法，直接返回内部类的静态属性
     * @return
     */
    public static StaticInternalClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
