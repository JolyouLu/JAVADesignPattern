package com.jolyoulu.prototype.improve;

/**
 * @Author: LZJ
 * @Date: 2020/11/5 23:14
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep1 = new Sheep("tom", 1, "白色");
        Sheep sheep2 = (Sheep) sheep1.clone();
        Sheep sheep3 = (Sheep) sheep1.clone();
        Sheep sheep4 = (Sheep) sheep1.clone();
        Sheep sheep5 = (Sheep) sheep1.clone();
    }
}
