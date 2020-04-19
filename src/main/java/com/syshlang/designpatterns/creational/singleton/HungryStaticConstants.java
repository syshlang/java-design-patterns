/*
 * Copyright (c) 2019.
 * @File: HungryStaticConstants.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/9/17 下午11:17
 * @since:
 */

package com.syshlang.designpatterns.creational.singleton;

/**
 * The type Hungry static constants.
 *
 * @author sunys
 */
public class HungryStaticConstants {
    /**
     * 构造器私有化,防止new
     */
    private HungryStaticConstants() {
    }

    /**
     * 类内部创建静态对象实例
     */
    private static final HungryStaticConstants instance  = new HungryStaticConstants();

    /**
     * 提供一个公有的取得其对象实例的静态方法
     *
     * @return hungry static constants
     */
    public static HungryStaticConstants getInstance(){
        return instance;
    }
}
