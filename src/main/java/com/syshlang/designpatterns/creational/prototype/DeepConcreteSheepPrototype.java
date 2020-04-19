/*
 * Copyright (c) 2020.
 * @File: DeepConcreteSheepPrototype.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/15 下午1:38
 * @since:
 */

package com.syshlang.designpatterns.creational.prototype;

/**
 * The type Deep concrete sheep prototype.
 *
 * @author sunys
 */
public class DeepConcreteSheepPrototype  implements Cloneable{
    private String name;
    private int age;
    private String color;
    private SheepPrototype mother;

    /**
     * Instantiates a new Deep concrete sheep prototype.
     *
     * @param name  the name
     * @param age   the age
     * @param color the color
     */
    public DeepConcreteSheepPrototype(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * Instantiates a new Deep concrete sheep prototype.
     */
    public DeepConcreteSheepPrototype() {
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
    protected DeepConcreteSheepPrototype clone()  {
        DeepConcreteSheepPrototype deepConcreteSheepPrototype = null;
        try {
            deepConcreteSheepPrototype = (DeepConcreteSheepPrototype) super.clone();
            SheepPrototype sheepPrototype = mother.clone();
            deepConcreteSheepPrototype.mother = sheepPrototype;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return deepConcreteSheepPrototype;
    }

    @Override
    public String toString() {
        return "DeepConcreteSheepPrototype{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", mother=" + mother +
                '}';
    }
}
