package com.jolyoulu.factory.simplefactor.pizzastore.order;

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
 * 简单工厂模式
 */
public class OrderPizza2 {

    //通过构造器传入工厂
    public OrderPizza2(SimpleFactory simpleFactory) {
        setFactory(simpleFactory);
    }

    //定义一个简单的工厂对象
    SimpleFactory simpleFactory;

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";
        Pizza pizza = null;
        this.simpleFactory =simpleFactory;
        do {
            orderType = getType();
            pizza = this.simpleFactory.creatPizza(orderType);
            if (pizza != null){
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            }else {
                System.out.println("订购披萨失败");
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
