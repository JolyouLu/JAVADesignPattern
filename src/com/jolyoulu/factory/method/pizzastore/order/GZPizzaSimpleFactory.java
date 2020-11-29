package com.jolyoulu.factory.method.pizzastore.order;

import com.jolyoulu.factory.method.pizzastore.pizza.BJCheesePizza;
import com.jolyoulu.factory.method.pizzastore.pizza.BJGreekPizza;
import com.jolyoulu.factory.method.pizzastore.pizza.GZCheesePizza;
import com.jolyoulu.factory.method.pizzastore.pizza.Pizza;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 10:58
 * @Version 1.0
 */
public class GZPizzaSimpleFactory extends PizzaSimpleFactory {
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new GZCheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new GZCheesePizza();
        }
        return pizza;
    }
}
