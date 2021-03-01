package com.jolyoulu.bridge;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/28 22:23
 * @Version 1.0
 */
public class HuaWei implements Brand{
    @Override
    public void open() {
        System.out.println("华为手机开机");
    }

    @Override
    public void close() {
        System.out.println("华为手机关机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
