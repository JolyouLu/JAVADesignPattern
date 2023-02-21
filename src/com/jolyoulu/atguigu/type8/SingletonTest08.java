package com.jolyoulu.atguigu.type8;

/**
 * @Author: LZJ
 * @Date: 2020/9/13 9:50
 * @Version 1.0
 */
public class SingletonTest08 {
    public static void main(String[] args) {
        System.out.println("===========多线程============");
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.INSTANCE;
                System.out.println("singleton.hashCode="+singleton.hashCode());
                singleton.sayOK();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.INSTANCE;
                System.out.println("singleton.hashCode="+singleton.hashCode());
                singleton.sayOK();
            }
        }).start();
    }
}

//懒汉式（枚举类）
enum Singleton {
    INSTANCE;
    //测试调用方法
    public void sayOK(){
        System.out.println("ok~");
    }
}
