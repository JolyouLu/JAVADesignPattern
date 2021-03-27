package com.jolyoulu.facade;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/14 15:14
 * @Version 1.0
 */
public class Popcorn {

    //使用单例模式，饿汉式
    private static Popcorn instance = new Popcorn();

    public static Popcorn getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("爆米花，打开");
    }

    public void off(){
        System.out.println("爆米花，关闭");
    }

    public void pop(){
        System.out.println("装爆米花");
    }
}
