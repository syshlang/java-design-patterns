package com.syshlang.designpatterns.creational.prototype;

import org.junit.jupiter.api.Test;

/**
 * The type Deep concrete sheep prototype test.
 */
class DeepConcreteSheepPrototypeTest {

    /**
     * Clone object.
     */
    @Test
    void CloneObject(){
        System.out.println("Deep clone object by concrete clone prototype");
        System.out.println("====================================");
        DeepConcreteSheepPrototype deepDolly = new DeepConcreteSheepPrototype("dolly",2,"gray");
        deepDolly.setMother(new ConcreteSheepPrototype("dolly",5,"gray"));
        DeepConcreteSheepPrototype deepConcreteSheepPrototype = deepDolly.clone();
        DeepConcreteSheepPrototype deepConcreteSheepPrototype1 = deepDolly.clone();
        DeepConcreteSheepPrototype deepConcreteSheepPrototypeN = deepDolly.clone();
        deepDolly.getMother().setColor("red");
        System.out.println(deepDolly);
        System.out.println(deepConcreteSheepPrototype);
        System.out.println(deepConcreteSheepPrototype1);
        System.out.println(deepConcreteSheepPrototypeN);
        System.out.println("====================================");
    }
}