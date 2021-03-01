package com.jolyoulu.bridge;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/28 22:22
 * @Version 1.0
 */
public class XiaoMi implements Brand{
    @Override
    public void open() {
        System.out.println("小米手机开机");
    }

    @Override
    public void close() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
