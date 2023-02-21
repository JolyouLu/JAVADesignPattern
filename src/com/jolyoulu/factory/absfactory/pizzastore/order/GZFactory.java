package com.jolyoulu.factory.absfactory.pizzastore.order;

import com.jolyoulu.factory.absfactory.pizzastore.pizza.*;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 12:10
 * @Version 1.0
 */
public class GZFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new GZCheesePizza();
        }else if (orderType.equals("greek")){
            pizza = new GZGreekPizza();
        }
        return pizza;
    }
}
