package com.jolyoulu.atguigu.type4;

/**
 * @Author: LZJ
 * @Date: 2020/9/13 9:50
 * @Version 1.0
 */
public class SingletonTest04 {
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

//懒汉式（线程安全）
class Singleton {
    private static Singleton instance;
    //构造器私有化
    private Singleton(){}
    //对外提供一个静态方法返回实例对象，创建实例对象，调用该方法时加锁同步处理解决线程安全问题
    public static synchronized Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
