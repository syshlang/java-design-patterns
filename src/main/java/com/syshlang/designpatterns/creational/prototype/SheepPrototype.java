/*
 * Copyright (c) 2020.
 * @File: SheepPrototype.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/3 下午4:03
 * @since:
 */

package com.syshlang.designpatterns.creational.prototype;

import java.io.Serializable;

/**
 * @author sunys
 */
public abstract class SheepPrototype implements Cloneable, Serializable {
    private String name;
    private int age;
    private String color;
    private SheepPrototype mother;

    public SheepPrototype(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public SheepPrototype() {
    }
    protected abstract String eat();
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

    public SheepPrototype getMother() {
        return mother;
    }

    public void setMother(SheepPrototype mother) {
        this.mother = mother;
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

    @Override
    public String toString() {
        return "SheepPrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", mother=" + mother +
                '}';
    }
}
