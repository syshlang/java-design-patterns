/*
 * Copyright (c) 2020.
 * @File: SheepPrototype.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/3 下午4:03
 * @since:
 */

package com.syshlang.designpatterns.creational.prototype;

/**
 * @author sunys
 */
public abstract class SheepPrototype implements Cloneable{
    private String name;
    private int age;
    private String color;

    public SheepPrototype(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public SheepPrototype() {
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

    /**
     * 克隆实例
     * @return
     */
    @Override
    protected SheepPrototype clone()  {
        SheepPrototype sheepPrototype = null;
        try {
            sheepPrototype = (SheepPrototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheepPrototype;
    }
}
