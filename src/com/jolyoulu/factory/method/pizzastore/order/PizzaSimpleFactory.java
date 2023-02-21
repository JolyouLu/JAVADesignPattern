package com.jolyoulu.factory.method.pizzastore.order;



import com.jolyoulu.factory.method.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 10:53
 * @Version 1.0
 */
public abstract class PizzaSimpleFactory {

    //定义一个抽象方法，createPizza，让子类工厂自己实现
    abstract Pizza createPizza(String orderType);

    //构造器
    public PizzaSimpleFactory(){
        Pizza pizza = null;
        String orderType;
        do {
            orderType = getType();
            pizza = createPizza(orderType); //抽象方法，工厂子类实现
            //pizza制作
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    //从控制台获取订购披萨
    private String getType(){
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入披萨类型:");
            String str = strin.readLine();
            return str;
        }catch (IOException e){
            e.printStackTrace();
            return "";
        }
    }
}
