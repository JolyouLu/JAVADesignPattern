package com.jolyoulu.decorator.burden;

import com.jolyoulu.decorator.Drink;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/6 18:32
 * @Version 1.0
 */
public class Pudding extends Decorator{
    public Pudding(Drink drink) {
        super(drink);
        super.setDes("加布丁");
        super.setPrice(3.0f);
    }
}
