package com.jolyoulu.adapter.classadapter;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/28 0:18
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=== 类适配器模式 ===");
        Phone phone = new Phone();
        //传入适配器
        phone.charging(new VoltageAdapter());
    }
}
