package com.jolyoulu.bridge;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/28 22:24
 * @Version 1.0
 */
public abstract class Phone {

    //组合
    private Brand brand;

    //使用构造器传入
    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    }

    protected void close(){
        this.brand.close();
    }

    protected void call(){
        this.brand.call();
    }
}
