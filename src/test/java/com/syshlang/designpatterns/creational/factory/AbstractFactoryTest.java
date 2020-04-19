package com.syshlang.designpatterns.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Abstract factory test.
 */
class AbstractFactoryTest {

    /**
     * Get shape.
     */
    @Test
    void getShape(){
        System.out.println("Get shape by type shape1 use AbstractFactory");
        System.out.println("====================================");
        AbstractFactory.ShapeAbstractFactory circlecombination = AbstractFactory.ShapeAbstractFactory.getFactory("circlecombination");
        AbstractFactory.Shape shape = circlecombination.getShape();
        System.out.println(shape);
        AbstractFactory.ShapeAbstractFactory rectanglecombination = AbstractFactory.ShapeAbstractFactory.getFactory("rectanglecombination");
        AbstractFactory.Shape shape1 = rectanglecombination.getShape();
        System.out.println(shape1);
        System.out.println("====================================");
    }

}