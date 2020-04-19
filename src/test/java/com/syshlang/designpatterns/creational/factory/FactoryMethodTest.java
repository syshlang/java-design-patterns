package com.syshlang.designpatterns.creational.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The type Factory method test.
 */
class FactoryMethodTest {

    /**
     * Main.
     */
    @Test
    void main() {
        System.out.println("Get shape by type shape1 use FactoryMethod");
        System.out.println("====================================");
        FactoryMethod.CircleFactory circleFactory = new FactoryMethod().new CircleFactory();
        FactoryMethod.Shape circle = circleFactory.getShape();
        System.out.println(circle);
        FactoryMethod.RectangleFactory rectangleFactory = new FactoryMethod().new RectangleFactory();
        FactoryMethod.Shape rectangle = rectangleFactory.getShape();
        System.out.println(rectangle);
        System.out.println("====================================");
    }
}