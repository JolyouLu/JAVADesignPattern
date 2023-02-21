package com.jolyoulu.builder.improve;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/23 22:07
 * @Version 1.0
 * 抽象的建造者（Builder）
 */
public abstract class HouseBuilder {

    protected House house = new House();

    //建造的流程抽象好
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void rooted();

    //返回建造好的房子
    public House build(){
        return house;
    }
}
