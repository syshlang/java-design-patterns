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
 * @author sunys
 */
public class SimpleFactory {

    public static void main(String[] args) {
        Shape shape = ShapeSimpleFactory.getShapeByType("circle");
    }

    private interface Shape{
        /**
         * @return
         */
        String getShapeType();
    }
    private static class Circle implements Shape {
        public String getShapeType() {
            return "circle";
        }
    }
    private static class Rectangle implements Shape {
        public String getShapeType() {
            return "rectangle";
        }
    }


    private static class ShapeSimpleFactory{

        public static Shape getShapeByType(String type){
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
