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
 *
 * @author sunys
 */
public class BaoMaCarBuilder implements CarBuilder{
    Car car = new Car();
    public void buildEngine() {
        this.car.setEngine("建造宝马发动机！");
    }

    public void buildFrame() {
        this.car.setFrame("建造宝马车身框架！");
    }
    public void buildWheel() {
        this.car.setWheel("建造宝马轮胎！");
    }

    public Car getCar() {
        return this.car;
    }
}
