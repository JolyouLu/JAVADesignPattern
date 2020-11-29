package com.jolyoulu.factory.method.pizzastore.order;

import com.jolyoulu.factory.method.pizzastore.pizza.BJCheesePizza;
import com.jolyoulu.factory.method.pizzastore.pizza.BJGreekPizza;
import com.jolyoulu.factory.method.pizzastore.pizza.Pizza;


/**
 * @Author: LZJ
 * @Date: 2020/10/24 10:59
 * @Version 1.0
 */
public class BJPizzaSimpleFactory extends PizzaSimpleFactory{
    @Override
    Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if (orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }else if (orderType.equals("greek")){
            pizza = new BJGreekPizza();
        }
        return pizza;
    }
}
