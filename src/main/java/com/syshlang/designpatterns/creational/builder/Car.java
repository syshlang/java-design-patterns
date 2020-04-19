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
 * The type Car.
 *
 * @author sunys
 */
public class Car {
    private String engine;
    private String frame;
    private String wheel;

    /**
     * Gets engine.
     *
     * @return the engine
     */
    public String getEngine() {
        return engine;
    }

    /**
     * Sets engine.
     *
     * @param engine the engine
     */
    public void setEngine(String engine) {
        this.engine = engine;
    }

    /**
     * Gets frame.
     *
     * @return the frame
     */
    public String getFrame() {
        return frame;
    }

    /**
     * Sets frame.
     *
     * @param frame the frame
     */
    public void setFrame(String frame) {
        this.frame = frame;
    }

    /**
     * Gets wheel.
     *
     * @return the wheel
     */
    public String getWheel() {
        return wheel;
    }

    /**
     * Sets wheel.
     *
     * @param wheel the wheel
     */
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
