package com.jolyoulu.atguigu.type6;

/**
 * @Author: LZJ
 * @Date: 2020/9/13 9:50
 * @Version 1.0
 */
public class SingletonTest06 {
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

//懒汉式（双重检查，线程安全，高效率）
class Singleton {
    //volatile修饰instance变量保证多线程下变量的可见性
    private static volatile Singleton instance;
    //构造器私有化
    private Singleton(){}
    //对外提供一个静态方法返回实例对象，创建实例对象
    //使用双重检查，先检查是否空，如果是进入synchronized代码块，在创建进去再次检查空时再创建
    public static Singleton getInstance(){
        if (instance == null){
            synchronized(Singleton.class){
                if (instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
