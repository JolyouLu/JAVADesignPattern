package com.jolyoulu.atguigu.type7;

/**
 * @Author: LZJ
 * @Date: 2020/9/13 9:50
 * @Version 1.0
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        System.out.println("===========多线程============");
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                System.out.println("singleton.hashCode="+singleton.hashCode());
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                Singleton singleton = Singleton.getInstance();
                System.out.println("singleton.hashCode="+singleton.hashCode());
            }
        }).start();
    }
}

//懒汉式（静态内部类）
class Singleton {
    private Singleton(){}
    //Singleton装载时，SingletonInstance是不会被装载的
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    //在调用getInstance时SingletonInstance类才会被装载，类装载时线程是安全的
    public static Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
