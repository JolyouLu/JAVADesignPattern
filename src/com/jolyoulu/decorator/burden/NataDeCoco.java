package com.jolyoulu.decorator.burden;

import com.jolyoulu.decorator.Drink;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/6 18:32
 * @Version 1.0
 */
public class NataDeCoco extends Decorator{
    public NataDeCoco(Drink drink) {
        super(drink);
        super.setDes("加椰果");
        super.setPrice(2.0f);
    }
}
