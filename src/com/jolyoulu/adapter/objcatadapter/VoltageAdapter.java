package com.jolyoulu.adapter.objcatadapter;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/27 23:55
 * @Version 1.0
 * 适配器类 继承被适配类 实现适配接口
 */
public class VoltageAdapter implements Voltage5V {

    private Voltage220V voltage220V;

    //通过构造器传入Voltage220V
    public VoltageAdapter(Voltage220V voltage220V) {
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dstV = 0;
        if (null != voltage220V){
            //获取220V电压
            int srcV = voltage220V.output220V();
            //降压
            dstV = srcV / 44;
        }
        return dstV;
    }
}
