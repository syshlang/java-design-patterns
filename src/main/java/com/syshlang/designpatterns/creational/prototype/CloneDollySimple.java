/*
 * Copyright (c) 2020.
 * @File: CloneDollySimple.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/3 下午3:32
 * @since:
 */

package com.syshlang.designpatterns.creational.prototype;

/**
 * 以传统的简单方式克隆多莉羊
 * @author sunys
 */
public class CloneDollySimple {

    static class  Client{
        Sheep dolly = new Sheep("dolly",2,"gray");
        Sheep sheep = new Sheep(dolly.getName(),dolly.getAge(),dolly.getColor());
        Sheep sheep1 = new Sheep(dolly.getName(),dolly.getAge(),dolly.getColor());
        Sheep sheepN = new Sheep(dolly.getName(),dolly.getAge(),dolly.getColor());
    }
}
