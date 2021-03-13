package com.jolyoulu.decorator;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/6 16:56
 * @Version 1.0
 */
public abstract class Drink {

    public String des; //描述
    private float price = 0.0f; //价格

    //计算费用的抽象方法
    public abstract float cost();

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}