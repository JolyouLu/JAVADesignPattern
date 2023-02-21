package com.jolyoulu.adapter.interfaceadpter;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/27 23:55
 * @Version 1.0
 * 适配器类 继承被适配类 实现适配接口
 */
public abstract class VoltageAdapter implements Voltage5V,Voltage10V{
    //提供默认的实现
    @Override
    public int output5V() {
        return 0;
    }
    //提供默认的实现
    @Override
    public int output10V() {
        return 0;
    }
}
