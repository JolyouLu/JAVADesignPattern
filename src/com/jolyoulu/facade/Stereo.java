package com.jolyoulu.facade;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/14 15:20
 * @Version 1.0
 */
public class Stereo {

    //使用单例模式，饿汉式
    private static Stereo instance = new Stereo();

    public static Stereo getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("立体声，打开");
    }

    public void off(){
        System.out.println("立体声，关闭");
    }
}
