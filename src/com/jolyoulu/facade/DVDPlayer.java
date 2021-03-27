package com.jolyoulu.facade;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/14 15:11
 * @Version 1.0
 */
public class DVDPlayer {

    //使用单例模式，饿汉式
    private static DVDPlayer instance = new DVDPlayer();

    public static DVDPlayer getInstance(){
        return instance;
    }

    public void on(){
        System.out.println("dvd，打开");
    }

    public void off(){
        System.out.println("dvd，关闭");
    }

    public void play(){
        System.out.println("dvd，播放中");
    }

}
