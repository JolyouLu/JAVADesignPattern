package com.jolyoulu.atguigu.type3;

/**
 * @Author: LZJ
 * @Date: 2020/9/13 9:50
 * @Version 1.0
 */
public class SingletonTest03 {
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

//懒汉式（线程不安全）
class Singleton {
    private static Singleton instance;
    //构造器私有化
    private Singleton(){}
    //对外提供一个静态方法返回实例对象，调用该方法时在创建实例对象
    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
