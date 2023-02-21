package com.jolyoulu.visitor;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/3 16:26
 * @Version 1.0
 */
public class Man extends Person{

    private String name;

    @Override
    public void accept(Action action) {
        action.getManResult(this);
    }

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
