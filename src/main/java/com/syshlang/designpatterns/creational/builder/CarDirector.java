package com.syshlang.designpatterns.creational.builder;

/**
 * @author sunys
 */
public class CarDirector {
    private CarBuilder carBuilder;

    public CarDirector(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    /**
     * 构建汽车的流程交给指导者
     * @return
     */
    public Car builderCar(){
        carBuilder.buildEngine();
        carBuilder.buildFrame();
        carBuilder.buildWheel();
        return carBuilder.getCar();
    }
}

