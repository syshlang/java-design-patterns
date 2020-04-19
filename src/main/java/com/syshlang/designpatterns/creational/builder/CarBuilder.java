/*
 * Copyright (c) 2020.
 * @File: CarBuilder.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/17 上午10:32
 * @since:
 */

package com.syshlang.designpatterns.creational.builder;

/**
 * The interface Car builder.
 *
 * @author sunys
 */
public interface CarBuilder {
    /**
     * 建造发动机
     *
     * @return
     */
    void buildEngine();

    /**
     * 建造车身框架
     *
     * @return
     */
    void buildFrame();

    /**
     * 建造轮胎
     *
     * @return
     */
    void buildWheel();

    /**
     * 获取小汽车成品
     *
     * @return car car
     */
    Car getCar();
}
