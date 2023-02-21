package com.jolyoulu.flyweight;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/27 12:35
 * @Version 1.0
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
