package com.syshlang.designpatterns.creational.builder;

/**
 * The type Car director.
 *
 * @author sunys
 */
public class CarDirector {
    private CarBuilder carBuilder;

    /**
     * Instantiates a new Car director.
     *
     * @param carBuilder the car builder
     */
    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    /**
     * 构建汽车的流程交给指导者
     *
     * @return car car
     */
    public Car builderCar(){
        carBuilder.buildEngine();
        carBuilder.buildFrame();
        carBuilder.buildWheel();
        return carBuilder.getCar();
    }
}

