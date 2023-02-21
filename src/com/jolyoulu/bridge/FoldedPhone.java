package com.jolyoulu.bridge;

/**
 * @Author: JolyouLu
 * @Date: 2021/2/28 22:27
 * @Version 1.0
 */
public class FoldedPhone extends Phone{
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void open() {
        System.out.println("折叠式手机");
        super.open();
    }

    @Override
    protected void close() {
        System.out.println("折叠式手机");
        super.close();
    }

    @Override
    protected void call() {
        System.out.println("折叠式手机");
        super.call();
    }
}
