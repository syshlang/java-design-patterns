/*
 * Copyright (c) 2019.
 * @File: AbstractFactory.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/9/24 上午12:20
 * @since:
 */

package com.syshlang.designpatterns.creational.factory;

/**
 * The type Abstract factory.
 *
 * @author sunys
 */
public class AbstractFactory {

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

    /**
     * 圆组合
     */
    private static class CircleCombination extends ShapeAbstractFactory {
        @Override
        Shape getShape() {
            return new Circle();
        }
    }
    /**
     * 矩形组合
     */
    private static class RectangleCombination extends ShapeAbstractFactory {
        @Override
        Shape getShape() {
            return new Rectangle();
        }
    }


    /**
     * The type Shape abstract factory.
     */
    static abstract class ShapeAbstractFactory{
        private static final CircleCombination CIRCLECOMBINATION = new CircleCombination();
        private static final RectangleCombination RECTANGLECOMBINATION = new RectangleCombination();

        /**
         * Get factory shape abstract factory.
         *
         * @param Combination the combination
         * @return the shape abstract factory
         */
        static ShapeAbstractFactory getFactory(String Combination){
            if ("circlecombination".equals(Combination)){
                return CIRCLECOMBINATION;
            }
            if ("rectanglecombination".equals(Combination)){
                return RECTANGLECOMBINATION;
            }
            return null;
        }

        /**
         * Gets shape.
         *
         * @return the shape
         */
        abstract Shape getShape();
    }
}
