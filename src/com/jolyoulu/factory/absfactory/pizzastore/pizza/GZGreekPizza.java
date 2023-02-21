package com.jolyoulu.factory.absfactory.pizzastore.pizza;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 2:16
 * @Version 1.0
 */
public class GZGreekPizza extends Pizza {

    @Override
    public void prepare() {
        super.setName("广州的希腊Pizza");
        System.out.println("广州的希腊Pizza，准备制作希腊披萨的材料");
    }
}
