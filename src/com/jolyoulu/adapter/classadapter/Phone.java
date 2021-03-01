package com.jolyoulu.adapter.classadapter;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/27 23:58
 * @Version 1.0
 */
public class Phone {

    //充电
    public void charging(Voltage5V voltage5V){
        if (voltage5V.output5V() == 5){
            System.out.println("电压为5V，可以充电");
        }else if(voltage5V.output5V() > 5){
            System.out.println("电压大于5V，无法充电");
        }
    }

}
