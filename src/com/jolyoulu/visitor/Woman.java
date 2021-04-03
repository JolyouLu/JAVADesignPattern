package com.jolyoulu.visitor;

/**
 * @Author: JolyouLu
 * @Date: 2021/4/3 16:26
 * @Version 1.0
 */
public class Woman extends Person{

    private String name;

    @Override
    public void accept(Action action) {
        action.getWomanResult(this);
    }

    public Woman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
