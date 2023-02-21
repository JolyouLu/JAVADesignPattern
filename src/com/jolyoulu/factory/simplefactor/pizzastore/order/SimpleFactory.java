package com.jolyoulu.factory.simplefactor.pizzastore.order;

import com.jolyoulu.factory.simplefactor.pizzastore.pizza.CheesePizza;
import com.jolyoulu.factory.simplefactor.pizzastore.pizza.GreekPizza;
import com.jolyoulu.factory.simplefactor.pizzastore.pizza.Pizza;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 3:48
 * @Version 1.0
 * 简单工厂类
 */
public class SimpleFactory {
    //简单工厂模式
    public Pizza creatPizza(String orderType){
        Pizza pizza = null;
        System.out.println("通过简单工厂模式获取披萨");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if (orderType.equals("bacon")){
            pizza = new CheesePizza();
            pizza.setName("培根披萨");
        }
        return pizza;
    }

    //简单工厂模式-静态方法
    public static Pizza creatStaticPizza(String orderType){
        Pizza pizza = null;
        System.out.println("通过静态工厂模式获取披萨");
        if (orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }else if (orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }else if (orderType.equals("bacon")){
            pizza = new CheesePizza();
            pizza.setName("培根披萨");
        }
        return pizza;
    }
}
