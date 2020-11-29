package com.jolyoulu.factory.absfactory.pizzastore.pizza;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 2:17
 * @Version 1.0
 */
public class BJGreekPizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("北京的希腊Pizza");
        System.out.println("北京的希腊Pizza，准备制作希腊披萨的材料");
    }
}
