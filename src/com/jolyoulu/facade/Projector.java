package com.jolyoulu.facade;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/14 15:16
 * @Version 1.0
 */
public class Projector {

    //使用单例模式，饿汉式
    private static Projector instance = new Projector();

    public static Projector getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("投影仪，打开");
    }

    public void off(){
        System.out.println("投影仪，关闭");
    }

}
