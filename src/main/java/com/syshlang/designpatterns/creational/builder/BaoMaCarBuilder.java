/*
 * Copyright (c) 2020.
 * @File: BaoMaCar.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/17 上午10:38
 * @since:
 */

package com.syshlang.designpatterns.creational.builder;

/**
 * The type Bao ma car builder.
 *
 * @author sunys
 */
public class BaoMaCarBuilder implements CarBuilder{
    /**
     * The Car.
     */
    Car car = new Car();
    @Override
    public void buildEngine() {
        this.car.setEngine("建造宝马发动机！");
    }

    @Override
    public void buildFrame() {
        this.car.setFrame("建造宝马车身框架！");
    }
    @Override
    public void buildWheel() {
        this.car.setWheel("建造宝马轮胎！");
    }

    @Override
    public Car getCar() {
        return this.car;
    }

}
