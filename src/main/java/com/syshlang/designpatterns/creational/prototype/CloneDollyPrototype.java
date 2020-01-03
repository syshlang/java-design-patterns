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
        ConcreteSheepPrototype dolly = new ConcreteSheepPrototype("dolly",2,"gray");
        ConcreteSheepPrototype sheepPrototype = (ConcreteSheepPrototype) dolly.clone();
        ConcreteSheepPrototype sheepPrototype1 = (ConcreteSheepPrototype) dolly.clone();
        ConcreteSheepPrototype sheepPrototypeN = (ConcreteSheepPrototype) dolly.clone();
    }
}
