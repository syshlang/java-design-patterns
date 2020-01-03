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
 * @author sunys
 */
public class Sheep {
    private String name;
    private int age;
    private String color;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Sheep() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
