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
 * The type Factory method.
 *
 * @author sunys
 */
public class FactoryMethod {

    /**
     * The interface Shape.
     */
    interface Shape{}
    private static class Circle implements Shape {
        @Override
        public String toString() {
            return "Circle{" + super.toString()+ '}';
        }
    }
    private static class Rectangle implements Shape {
        @Override
        public String toString() {
            return "Rectangle{" + super.toString()+ '}';
        }
    }

    private interface ShapeFactoryMethod{
        /**
         * 生产几何图型
         *
         * @return shape shape
         */
        Shape getShape();
    }

    /**
     * The type Circle factory.
     */
    class CircleFactory implements ShapeFactoryMethod{
        @Override
        public Shape getShape() {
            return new Circle();
        }
    }

    /**
     * The type Rectangle factory.
     */
    class RectangleFactory implements ShapeFactoryMethod{
        @Override
        public Shape getShape() {
            return new Rectangle();
        }
    }
}
