package com.jolyoulu.decorator.item;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/6 17:58
 * @Version 1.0
 */
public class PearlMilkTea extends MilkTea{
    public PearlMilkTea() {
        //奶茶说明
        super.setDes("珍珠奶茶");
        //单价
        super.setPrice(10.0f);
    }
}
