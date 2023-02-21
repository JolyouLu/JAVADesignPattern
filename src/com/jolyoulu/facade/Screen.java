package com.jolyoulu.facade;

/**
 * @Author: JolyouLu
 * @Date: 2021/3/14 15:19
 * @Version 1.0
 */
public class Screen {

    //使用单例模式，饿汉式
    private static Screen instance = new Screen();

    public static Screen getInstance(){
        return instance;
    }

    public void up(){
        System.out.println("屏幕，上升");
    }

    public void down(){
        System.out.println("屏幕，下降");
    }

}
