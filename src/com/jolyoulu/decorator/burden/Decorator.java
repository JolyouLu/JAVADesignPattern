package com.jolyoulu.decorator.burden;

import com.jolyoulu.decorator.Drink;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/6 17:06
 * @Version 1.0
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        //自己的价格+drink价格
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDes() {
        return super.des + " " + super.getPrice() + " && " + drink.getDes();
    }
}
