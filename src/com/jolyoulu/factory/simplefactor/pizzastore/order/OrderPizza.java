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
 * 传统模式
 */
public class OrderPizza {

    public OrderPizza() {
        Pizza pizza = null;
        String orderType; //订购披萨的类型
        do {
            orderType = getType();
            //判断订购类型 创建相应的披萨
            if (orderType.equals("greek")){
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            }else if (orderType.equals("cheese")){
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            }else if (orderType.equals("bacon")){
                pizza = new CheesePizza();
                pizza.setName("培根披萨");
            }else{
                break;
            }
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
