package com.jolyoulu.atguigu.type2;

/**
 * @Author: LZJ
 * @Date: 2020/9/13 9:50
 * @Version 1.0
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
        System.out.println("singleton1.hashCode="+singleton1.hashCode());
        System.out.println("singleton2.hashCode="+singleton2.hashCode());
    }
}

//饿汉式（静态代码块）
class Singleton {
    private static Singleton instance;
    //静态代码快创建实例
    static {
        instance = new Singleton();
    }
    //构造器私有化
    private Singleton(){}
    //对外提供一个静态方法返回实例对象
    public static Singleton getInstance(){
        return instance;
    }
}
