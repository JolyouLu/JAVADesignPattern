package com.jolyoulu.factory.absfactory.pizzastore.order;

import com.jolyoulu.factory.absfactory.pizzastore.pizza.Pizza;

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

    AbsFactory factory;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    private void setFactory(AbsFactory factory){
        Pizza pizza = null;
        String orderType="";
        this.factory = factory;
        do {
            orderType = getType();
            pizza = factory.createPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购失败");
                break;
            }
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
