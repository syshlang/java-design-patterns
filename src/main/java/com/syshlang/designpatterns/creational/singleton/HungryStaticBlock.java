/*
 * Copyright (c) 2019.
 * @File: HungryStaticBlock.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/9/17 下午11:16
 * @since:
 */

package com.syshlang.designpatterns.creational.singleton;

/**
 * The type Hungry static block.
 *
 * @author sunys
 */
public class HungryStaticBlock {
    /**
     * 构造器私有化,防止new
     */
    private HungryStaticBlock() {
    }
    private static final HungryStaticBlock instance;
    /**
     * 在静态代码块中，创建单例对象
     */
    static {
        instance = new HungryStaticBlock();
    }

    /**
     * 提供一个公有的取得其对象实例的静态方法
     *
     * @return instance instance
     */
    public static HungryStaticBlock getInstance() {
        return instance;
    }
}
