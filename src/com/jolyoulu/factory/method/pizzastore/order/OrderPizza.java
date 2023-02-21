package com.jolyoulu.factory.method.pizzastore.order;

import com.jolyoulu.factory.simplefactor.pizzastore.pizza.CheesePizza;
import com.jolyoulu.factory.simplefactor.pizzastore.pizza.GreekPizza;
import com.jolyoulu.factory.simplefactor.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 2:18
 * @Version 1.0
 * 传统模式
 */
public class OrderPizza {
    public OrderPizza(String loc) {
        if (loc.equals("bj")){
            new BJPizzaSimpleFactory();
        }else if (loc.equals("gz")){
            new GZPizzaSimpleFactory();
        }
    }
}
