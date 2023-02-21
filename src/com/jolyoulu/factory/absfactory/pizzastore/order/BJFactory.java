package com.jolyoulu.factory.absfactory.pizzastore.order;

import com.jolyoulu.factory.absfactory.pizzastore.pizza.BJCheesePizza;
import com.jolyoulu.factory.absfactory.pizzastore.pizza.BJGreekPizza;
import com.jolyoulu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 12:08
 * @Version 1.0
 */
public class BJFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("greek")){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
