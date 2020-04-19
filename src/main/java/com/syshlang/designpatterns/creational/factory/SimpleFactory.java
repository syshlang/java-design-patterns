/*
 * Copyright (c) 2019.
 * @File: SimpleFactory.java
 * @Description:
 * @Author: sunys
 * @Date: 2019/9/23 下午10:44
 * @since:
 */

package com.syshlang.designpatterns.creational.factory;

/**
 * The type Simple factory.
 *
 * @author sunys
 */
public class SimpleFactory {

    /**
     * The interface Shape.
     */
    interface Shape{
        /**
         * Gets shape type.
         *
         * @return shape type
         */
        String getShapeType();
    }
    private class Circle implements Shape {
        @Override
        public String getShapeType() {
            return "circle";
        }

        @Override
        public String toString() {
            return "circle{" + super.toString()+ '}';
        }
    }
    private class Rectangle implements Shape {
        @Override
        public String getShapeType() {
            return "rectangle";
        }
        @Override
        public String toString() {
            return "rectangle{" + super.toString()+ '}';
        }
    }


    /**
     * The type Shape simple factory.
     */
    class ShapeSimpleFactory{

        /**
         * Get shape by type shape.
         *
         * @param type the type
         * @return the shape
         */
        Shape getShapeByType(String type){
            if ("circle".equals(type)){
                return new Circle();
            }else  if ("rectangle".equals(type)){
                return new Rectangle();
            }else {
                return  null;
            }
        }
    }
}
