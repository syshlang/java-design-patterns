package com.syshlang.designpatterns.creational.prototype;

import org.junit.jupiter.api.Test;

/**
 * The type Concrete sheep prototype test.
 */
class ConcreteSheepPrototypeTest {

    /**
     * Clone object.
     */
    @Test
    void CloneObject(){
        System.out.println("Clone object by concrete prototype");
        System.out.println("====================================");
        ConcreteSheepPrototype dolly = new ConcreteSheepPrototype("dolly",2,"gray");
        dolly.setMother(new ConcreteSheepPrototype("dolly",5,"gray"));
        ConcreteSheepPrototype sheepPrototype = (ConcreteSheepPrototype) dolly.clone();
        ConcreteSheepPrototype sheepPrototype1 = (ConcreteSheepPrototype) dolly.clone();
        ConcreteSheepPrototype sheepPrototypeN = (ConcreteSheepPrototype) dolly.clone();
        dolly.getMother().setColor("red");
        dolly.setAge(6);
        System.out.println(dolly);
        System.out.println(sheepPrototype);
        System.out.println(sheepPrototype1);
        System.out.println(sheepPrototypeN);
        System.out.println("====================================");
    }
}
