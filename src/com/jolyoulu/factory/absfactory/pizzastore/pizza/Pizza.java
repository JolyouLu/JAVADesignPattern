package com.jolyoulu.factory.absfactory.pizzastore.pizza;

/**
 * @Author: LZJ
 * @Date: 2020/10/24 2:13
 * @Version 1.0
 */
public abstract class Pizza {

    //名称
    protected String name;

    //准备原材料，不同披萨不一样，所有需要抽象出来给子类实现
    public abstract void prepare();

    //烘烤
    public void bake(){
        System.out.println(name + " 烘培");
    }

    //切
    public void cut(){
        System.out.println(name + " 切分");
    }

    //打包
    public void box(){
        System.out.println(name + " 打包");
    }

    public void setName(String name) {
        this.name = name;
    }
}
