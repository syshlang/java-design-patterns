/*
 * Copyright (c) 2019.
 * @File: SingletonEnum.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/9/18 上午12:39
 * @since:
 */

package com.syshlang.designpatterns.creational.singleton;

/**
 * @author sunys
 */
public class  SingletonEnum {
    public static void main(String[] args) {
        Instance instance = Singleton.INSTANCE.instance;
    }
    private static class Instance{}
    enum Singleton{
        INSTANCE;
        private Instance instance;
        Singleton() {
            instance = new Instance();
        }
    }

}
