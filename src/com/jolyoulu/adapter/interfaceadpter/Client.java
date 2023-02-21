package com.jolyoulu.adapter.interfaceadpter;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/28 0:18
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=== 接口适配器模式 ===");
        VoltageAdapter voltageAdapter = new VoltageAdapter(){
            @Override
            public int output5V() {
                Voltage220V voltage220V = new Voltage220V();
                //获取220V电压
                int srcV = voltage220V.output220V();
                //降压
                int dstV = srcV / 44;
                return dstV;
            }
        };
        Phone phone = new Phone();
        //传入适配器
        phone.charging(voltageAdapter);
    }
}
