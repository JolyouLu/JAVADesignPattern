package com.jolyoulu.visitor;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/3 16:26
 * @Version 1.0
 */
public abstract class Person {
    //提供一个方法让访问者访问
    public abstract void accept(Action action);
}
