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
 * @author sunys
 */
public class DeepConcreteSheepSerializable implements Serializable {
    private static final long serialVersionUID = 8738439006982997247L;
    private String name;
    private int age;
    private String color;
    private SheepPrototype mother;

    public DeepConcreteSheepSerializable(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public DeepConcreteSheepSerializable() {
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
