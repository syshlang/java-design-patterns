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
 * @author sunys
 */
public class AbstractFactory {
    public static void main(String[] args) {
        ShapeAbstractFactory circlecombination = ShapeAbstractFactory.getFactory("circlecombination");
        Shape shape = circlecombination.getShape();
    }

    private interface Shape{}
    private static class Circle implements Shape { }
    private static class Rectangle implements Shape { }

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


    private static abstract class ShapeAbstractFactory{
        private static final CircleCombination CIRCLECOMBINATION = new CircleCombination();
        private static final RectangleCombination RECTANGLECOMBINATION = new RectangleCombination();
        static ShapeAbstractFactory getFactory(String Combination){
            if ("circlecombination".equals(Combination)){
                return CIRCLECOMBINATION;
            }
            if ("rectanglecombination".equals(Combination)){
                return RECTANGLECOMBINATION;
            }
            return null;
        }
        abstract Shape getShape();
    }
}
