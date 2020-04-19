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
 * The type Singleton enum.
 *
 * @author sunys
 */
public class  SingletonEnum {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Instance instance = Singleton.INSTANCE.instance;
    }
    private static class Instance{}

    /**
     * The enum Singleton.
     */
    enum Singleton{
        /**
         * Instance singleton.
         */
        INSTANCE;
        private Instance instance;
        Singleton() {
            instance = new Instance();
        }
    }

}
