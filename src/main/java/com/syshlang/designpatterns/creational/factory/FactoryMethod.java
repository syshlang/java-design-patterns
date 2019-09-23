/*
 * Copyright (c) 2019.
 * @File: FactoryMethod.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/9/23 下午11:35
 * @since:
 */

package com.syshlang.designpatterns.creational.factory;

/**
 * @author sunys
 */
public class FactoryMethod {

    public static void main(String[] args) {
        CircleFactory circleFactory = new CircleFactory();
        Shape circle = circleFactory.createShape();
        RectangleFactory rectangleFactory = new RectangleFactory();
        Shape rectangle = rectangleFactory.createShape();
    }
    private interface Shape{}
    private static class Circle implements Shape { }
    private static class Rectangle implements Shape { }

    private interface ShapeFactoryMethod{
        /**
         * 生产几何图型
         * @return
         */
        Shape createShape();
    }
    private static class CircleFactory implements ShapeFactoryMethod{
        public Shape createShape() {
            return new Circle();
        }
    }
    private static class RectangleFactory implements ShapeFactoryMethod{
        public Shape createShape() {
            return new Rectangle();
        }
    }
}
