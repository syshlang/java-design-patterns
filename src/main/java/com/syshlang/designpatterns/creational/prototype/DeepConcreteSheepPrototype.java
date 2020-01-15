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
 * @author sunys
 */
public class DeepConcreteSheepPrototype  implements Cloneable{
    private String name;
    private int age;
    private String color;
    private SheepPrototype mother;

    public DeepConcreteSheepPrototype(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public DeepConcreteSheepPrototype() {
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
