package com.jolyoulu.decorator.item;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/6 18:03
 * @Version 1.0
 */
public class BerryTea extends MilkTea{
    public BerryTea() {
        //奶茶说明
        super.setDes("莓莓果茶");
        //单价
        super.setPrice(12.0f);
    }
}
