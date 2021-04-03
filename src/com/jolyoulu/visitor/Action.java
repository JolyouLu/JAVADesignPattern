package com.jolyoulu.visitor;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/3 16:23
 * @Version 1.0
 */
public abstract class Action {
    //得到男性的测评
    public abstract void getManResult(Man man);

    //得到女的测评
    public abstract void getWomanResult(Woman woman);
}
