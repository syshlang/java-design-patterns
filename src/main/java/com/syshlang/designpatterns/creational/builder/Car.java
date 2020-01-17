/*
 * Copyright (c) 2020.
 * @File: Car.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/17 上午10:22
 * @since:
 */

package com.syshlang.designpatterns.creational.builder;

/**
 *
 * @author sunys
 */
public class Car {
    private String engine;
    private String frame;
    private String wheel;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getFrame() {
        return frame;
    }

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", frame='" + frame + '\'' +
                ", wheel='" + wheel + '\'' +
                '}';
    }
}
