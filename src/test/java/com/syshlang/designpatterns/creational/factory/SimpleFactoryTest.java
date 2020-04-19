package com.syshlang.designpatterns.creational.factory;

import org.junit.jupiter.api.Test;

/**
 * The type Simple factory test.
 */
class SimpleFactoryTest {

    /**
     * Get shape by type.
     */
    @Test
    void getShapeByType(){
        System.out.println("Get shape by type shape use SimpleFactory");
        System.out.println("====================================");
        SimpleFactory.ShapeSimpleFactory shapeSimpleFactory = new SimpleFactory().new ShapeSimpleFactory();
        SimpleFactory.Shape shape = shapeSimpleFactory.getShapeByType("circle");
        System.out.println(shape);
        SimpleFactory.Shape shape1 = shapeSimpleFactory.getShapeByType("rectangle");
        System.out.println(shape1);
        System.out.println("====================================");
    }

}