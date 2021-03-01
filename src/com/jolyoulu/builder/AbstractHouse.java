package com.jolyoulu.builder;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/23 21:08
 * @Version 1.0
 */
public abstract class AbstractHouse {
    //打地基
    public abstract void buildBasic();
    //砌墙
    public abstract void buildWalls();
    //封顶
    public abstract void rooted();

    public void build(){
        buildBasic();
        buildWalls();
        rooted();
    }
}
