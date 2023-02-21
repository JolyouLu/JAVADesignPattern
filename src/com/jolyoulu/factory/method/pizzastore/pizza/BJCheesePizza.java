package com.jolyoulu.factory.method.pizzastore.pizza;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 3:27
 * @Version 1.0
 */
public class BJCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.setName("北京的奶酪Pizza");
        System.out.println("北京的奶酪Pizza，准备制作奶酪披萨的材料");
    }
}
