package com.jolyoulu.factory.absfactory.pizzastore.order;

import com.jolyoulu.factory.absfactory.pizzastore.pizza.Pizza;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 12:06
 * @Version 1.0
 * 抽象工厂模式的抽象层（接口）
 */
public interface AbsFactory {
    Pizza createPizza(String orderType);
}
