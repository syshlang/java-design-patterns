/*
 * Copyright (c) 2020.
 * @File: Client.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/17 上午10:51
 * @since:
 */

package com.syshlang.designpatterns.creational.builder;

/**
 * @author sunys
 */
public class Client {
    public static void main(String[] args) {
        BaoMaCarBuilder baoMaCarBuilder = new BaoMaCarBuilder();
        CarDirector carDirector = new CarDirector(baoMaCarBuilder);
        Car car = carDirector.builderCar();
        System.out.println(car);
    }
}

