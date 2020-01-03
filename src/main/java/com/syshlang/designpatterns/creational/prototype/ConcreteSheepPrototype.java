/*
 * Copyright (c) 2020.
 * @File: ConcreteSheepPrototype.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/3 下午4:36
 * @since:
 */

package com.syshlang.designpatterns.creational.prototype;

/**
 * 创建当前对象的浅表副本
 * @author sunys
 */
public class ConcreteSheepPrototype extends SheepPrototype{
    public ConcreteSheepPrototype(String name, int age, String color) {
        super(name, age, color);
    }
}
