package com.jolyoulu.factory.absfactory.pizzastore.order;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 2:25
 * @Version 1.0
 */
public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new BJFactory());
    }
}
