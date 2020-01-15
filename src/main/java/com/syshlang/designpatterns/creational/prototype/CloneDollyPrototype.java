/*
 * Copyright (c) 2020.
 * @File: CloneDollyPrototype.java
 * @Description:
 * @Author: sunys
 * @Date: 2020/1/3 下午4:08
 * @since:
 */

package com.syshlang.designpatterns.creational.prototype;

/**
 *
 * 以原型模式克隆多莉羊
 * @author sunys
 */
public class CloneDollyPrototype {

    static class  Client{
        public static void main(String[] args) {
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


            DeepConcreteSheepSerializable deepDollySerializable = new DeepConcreteSheepSerializable("dolly",2,"gray");
            deepDollySerializable.setMother(new ConcreteSheepPrototype("dolly",5,"gray"));
            DeepConcreteSheepSerializable deepConcreteSheepSerializable = deepDollySerializable.deepClone();
            deepDollySerializable.getMother().setColor("red");
            deepDollySerializable.setAge(6);
            System.out.println(deepDollySerializable);
            System.out.println(deepConcreteSheepSerializable);
        }
    }
}
