package com.jolyoulu.adapter.classadapter;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/27 23:55
 * @Version 1.0
 * 适配器类 继承被适配类 实现适配接口
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V{
    @Override
    public int output5V() {
        //获取220V电压
        int srcV = output220V();
        //降压
        int dstV = srcV / 44;
        return dstV;
    }
}
