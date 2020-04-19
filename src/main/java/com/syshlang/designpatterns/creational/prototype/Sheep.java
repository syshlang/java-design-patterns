/*
 * Copyright (c) 2020.
 * @File: Sheep.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/3 下午3:54
 * @since:
 */

package com.syshlang.designpatterns.creational.prototype;

/**
 * The type Sheep.
 *
 * @author sunys
 */
public class Sheep {
    private String name;
    private int age;
    private String color;

    /**
     * Instantiates a new Sheep.
     *
     * @param name  the name
     * @param age   the age
     * @param color the color
     */
    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * Instantiates a new Sheep.
     */
    public Sheep() {
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets age.
     *
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets age.
     *
     * @param age the age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets color.
     *
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets color.
     *
     * @param color the color
     */
    public void setColor(String color) {
        this.color = color;
    }
}
