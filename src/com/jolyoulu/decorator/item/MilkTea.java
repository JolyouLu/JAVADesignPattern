package com.jolyoulu.decorator.item;

import com.jolyoulu.decorator.Drink;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/6 17:55
 * @Version 1.0
 */
public class MilkTea extends Drink {
    @Override
    public float cost() {
        return super.getPrice();
    }
}
