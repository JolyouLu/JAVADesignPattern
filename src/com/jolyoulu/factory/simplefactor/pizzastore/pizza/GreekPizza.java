package com.jolyoulu.factory.simplefactor.pizzastore.pizza;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 2:17
 * @Version 1.0
 */
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("准备制作希腊披萨的材料");
    }
}
