/*
 * Copyright (c) 2020.
 * @File: DeepConcreteSheepSerializable.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/15 下午5:31
 * @since:
 */

package com.syshlang.designpatterns.creational.prototype;

import java.io.*;

/**
 * The type Deep concrete sheep serializable.
 *
 * @author sunys
 */
public class DeepConcreteSheepSerializable implements Serializable {
    private static final long serialVersionUID = 8738439006982997247L;
    private String name;
    private int age;
    private String color;
    private SheepPrototype mother;

    /**
     * Instantiates a new Deep concrete sheep serializable.
     *
     * @param name  the name
     * @param age   the age
     * @param color the color
     */
    public DeepConcreteSheepSerializable(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    /**
     * Instantiates a new Deep concrete sheep serializable.
     */
    public DeepConcreteSheepSerializable() {
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
     * Deep clone deep concrete sheep serializable.
     *
     * @return the deep concrete sheep serializable
     */
    public DeepConcreteSheepSerializable deepClone(){
        ByteArrayOutputStream out = null;
        ObjectOutputStream obs = null;
        ByteArrayInputStream ios = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            out = new ByteArrayOutputStream();
            obs = new ObjectOutputStream(out);
            obs.writeObject(this);
            obs.close();

            //反序列化
            ios = new ByteArrayInputStream(out.toByteArray());
            ois = new ObjectInputStream(ios);
            //返回生成的新对象
            DeepConcreteSheepSerializable deepConcreteSheepSerializable = (DeepConcreteSheepSerializable) ois.readObject();
            ois.close();
            return deepConcreteSheepSerializable;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                obs.close();
                ios.close();
                ois.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "DeepConcreteSheepSerializable{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", mother=" + mother +
                '}';
    }
}
