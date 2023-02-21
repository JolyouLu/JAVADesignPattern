package com.jolyoulu.builder.improve;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/23 22:12
 * @Version 1.0
 */
public class HouseDirector {
    HouseBuilder houseBuilder = null;

    //方法1.构造器传入houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //方法2.构造setter传入houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //如何处理建造房子的流程，交给指挥者
    public House constructHouse(){
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.rooted();
        return houseBuilder.build();
    }
}
