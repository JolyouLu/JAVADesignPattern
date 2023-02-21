package com.jolyoulu.factory.simplefactor.pizzastore.pizza;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 3:27
 * @Version 1.0
 */
public class BaconPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("准备制作奶酪披萨的材料");
    }
}
