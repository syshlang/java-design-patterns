package com.syshlang.designpatterns.creational.prototype;

import org.junit.jupiter.api.Test;

/**
 * The type Deep concrete sheep serializable test.
 */
class DeepConcreteSheepSerializableTest {


    /**
     * Clone object.
     */
    @Test
    void CloneObject(){
        System.out.println("Deep clone object by concrete serializable");
        System.out.println("====================================");
        DeepConcreteSheepSerializable deepDollySerializable = new DeepConcreteSheepSerializable("dolly",2,"gray");
        deepDollySerializable.setMother(new ConcreteSheepPrototype("dolly",5,"gray"));
        DeepConcreteSheepSerializable deepConcreteSheepSerializable = deepDollySerializable.deepClone();
        deepDollySerializable.getMother().setColor("red");
        deepDollySerializable.setAge(6);
        System.out.println(deepDollySerializable);
        System.out.println(deepConcreteSheepSerializable);
        System.out.println("====================================");
    }
}