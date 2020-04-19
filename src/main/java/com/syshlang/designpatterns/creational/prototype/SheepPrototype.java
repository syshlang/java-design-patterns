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
 * The type Sheep prototype.
 *
 * @author sunys
 */
public abstract class SheepPrototype implements Cloneable, Serializable {
    private String name;
    private int age;
    private String color;
    private SheepPrototype mother;

    /**
     * Instantiates a new Sheep prototype.
     *
     * @param name  the name
     * @param age   the age
     * @param color the color
     */
    public SheepPrototype(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * Instantiates a new Sheep prototype.
     */
    public SheepPrototype() {
    }

    /**
     * Eat string.
     *
     * @return the string
     */
    protected abstract String eat();

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

    /**
     * Gets mother.
     *
     * @return the mother
     */
    public SheepPrototype getMother() {
        return mother;
    }

    /**
     * Sets mother.
     *
     * @param mother the mother
     */
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
