package com.jolyoulu.facade;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/14 15:21
 * @Version 1.0
 */
public class TheaterLights {

    //使用单例模式，饿汉式
    private static TheaterLights instance = new TheaterLights();

    public static TheaterLights getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("灯光，打开");
    }

    public void off(){
        System.out.println("灯光，关闭");
    }
}
