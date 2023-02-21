package com.jolyoulu.factory.simplefactor.pizzastore.pizza;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 2:16
 * @Version 1.0
 */
public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("准备制作奶酪披萨的材料");
    }
}
