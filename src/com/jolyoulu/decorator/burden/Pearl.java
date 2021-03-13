package com.jolyoulu.decorator.burden;

import com.jolyoulu.decorator.Drink;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/6 18:06
 * @Version 1.0
 */
public class Pearl extends Decorator{
    public Pearl(Drink drink) {
        super(drink);
        super.setDes("加珍珠");
        super.setPrice(1.0f);
    }
}
